/*
 * Copyright (C) 2010, 2011, 2012 by Arne Kesting, Martin Treiber, Ralph Germ, Martin Budden
 *                                   <movsim.org@gmail.com>
 * -----------------------------------------------------------------------------------------
 * 
 * This file is part of
 * 
 * MovSim - the multi-model open-source vehicular-traffic simulator.
 * 
 * MovSim is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * MovSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MovSim. If not, see <http://www.gnu.org/licenses/>
 * or <http://www.movsim.org>.
 * 
 * -----------------------------------------------------------------------------------------
 */
package org.movsim.viewer.graphics;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.movsim.roadmappings.RoadMapping;
import org.movsim.simulator.roadnetwork.RoadNetwork;
import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.roadnetwork.VariableMessageSignBase;
import org.movsim.simulator.roadnetwork.VariableMessageSignDiversion;
import org.movsim.simulator.trafficlights.TrafficLightLocation;
import org.movsim.simulator.vehicles.Vehicle;
import org.movsim.viewer.graphics.TrafficCanvas.VehicleColorMode;
import org.movsim.viewer.util.SwingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrafficCanvasMouseListener implements MouseListener, MouseMotionListener, MouseWheelListener {

    final static Logger logger = LoggerFactory.getLogger(TrafficCanvasMouseListener.class);
    private final TrafficCanvas trafficCanvas;
    private final TrafficCanvasController controller;
    private final RoadNetwork roadNetwork;
    private boolean diversionOn;
    private VariableMessageSignBase variableMessageSign = new VariableMessageSignDiversion();
    private boolean inDrag;
    private int startDragX;
    private int startDragY;
    private int xOffsetSave;
    private int yOffsetSave;
    private final boolean draggingAllowed = true;

    /**
     * @param trafficCanvas
     */
    public TrafficCanvasMouseListener(TrafficCanvas trafficCanvas, TrafficCanvasController controller, RoadNetwork roadNetwork) {
        this.trafficCanvas = trafficCanvas;
        this.controller = controller;
        this.roadNetwork = roadNetwork;
    }

    public void reset() {
        diversionOn = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        logger.debug("mouseClicked at " + e.getPoint()); //$NON-NLS-1$
        if (trafficCanvas.lastVehicleViewed != -1) {
            logger.debug("vehicle id set"); //$NON-NLS-1$
            trafficCanvas.vehicleToHighlightId = trafficCanvas.lastVehicleViewed;
            trafficCanvas.vehicleColorMode = VehicleColorMode.HIGHLIGHT_VEHICLE;
            trafficCanvas.repaint();
        }
        for (final RoadSegment roadSegment : roadNetwork) {
            // TODO for the moment clicking anywhere sets vehicles in lane1 of roadsegment1 to exit in next road segment
            if (roadNetwork.hasVariableMessageSign() && roadSegment.userId().equals("1")) {
                if (diversionOn == false) {
                    diversionOn = true;
                    roadSegment.addVariableMessageSign(variableMessageSign);
                } else {
                    diversionOn = false;
                    roadSegment.removeVariableMessageSign(variableMessageSign);
                }
                trafficCanvas.repaint();
            }
            if (roadSegment.trafficLightLocations() != null) {
                final RoadMapping roadMapping = roadSegment.roadMapping();
                for (final TrafficLightLocation trafficLightLocation : roadSegment.trafficLightLocations()) {
                    final Rectangle2D trafficLightRect = TrafficCanvas.trafficLightRect(roadMapping, trafficLightLocation);
                    // check if the user has clicked on a traffic light, if they have then change the
                    // traffic light to the next color
                    final Point point = e.getPoint();
                    final Point2D transformedPoint = new Point2D.Float();
                    final GeneralPath path = new GeneralPath();
                    try {
                        // convert from mouse coordinates to canvas coordinates
                        trafficCanvas.transform.inverseTransform(new Point2D.Float(point.x, point.y), transformedPoint);
                    } catch (final NoninvertibleTransformException e1) {
                        e1.printStackTrace();
                        return;
                    }
                    if (trafficLightRect.contains(transformedPoint)) {
                        trafficLightLocation.getTrafficLight().triggerNextPhase();
                        trafficCanvas.repaint();
                    }
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        if (!draggingAllowed) {
            return;
        }
        final Point point = e.getPoint();
        startDragX = point.x;
        startDragY = point.y;
        xOffsetSave = trafficCanvas.xOffset;
        yOffsetSave = trafficCanvas.yOffset;
        inDrag = true;
        trafficCanvas.backgroundChanged = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        inDrag = false;
        trafficCanvas.backgroundChanged = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        logger.debug("SimCanvas mouseEntered"); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        final Point p = e.getPoint();
        if (inDrag) {
            final int xOffsetNew = xOffsetSave + (int) ((p.x - startDragX) / trafficCanvas.scale);
            final int yOffsetNew = yOffsetSave + (int) ((p.y - startDragY) / trafficCanvas.scale);
            trafficCanvas.backgroundChanged = false;
            if (xOffsetNew != trafficCanvas.xOffset || yOffsetNew != trafficCanvas.yOffset) {
                trafficCanvas.xOffset = xOffsetNew;
                trafficCanvas.yOffset = yOffsetNew;
                trafficCanvas.setTransform();
                trafficCanvas.forceRepaintBackground();
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        if (trafficCanvas.isStopped() || trafficCanvas.isPaused()) {
            if (trafficCanvas.vehicleTipWindow == null) {
                trafficCanvas.vehicleTipWindow = new VehicleTipWindow(trafficCanvas,
                        SwingHelper.getFrame(trafficCanvas));
            }
            final Point point = e.getPoint();
            final Point2D transformedPoint = new Point2D.Float();
            final GeneralPath path = new GeneralPath();
            try {
                // convert from mouse coordinates to vehicle coordinates
                trafficCanvas.transform.inverseTransform(new Point2D.Float(point.x, point.y), transformedPoint);
            } catch (final NoninvertibleTransformException e1) {
                e1.printStackTrace();
                return;
            }
            // iterate over all vehicles in all road segments, to see if the
            // mouse is over a vehicle
            final double simulationTime = trafficCanvas.simulationRunnable.simulationTime();
            for (final RoadSegment roadSegment : roadNetwork) {
                final RoadMapping roadMapping = roadSegment.roadMapping();
                for (final Vehicle vehicle : roadSegment) {
                    // TODO quick hack here,no correction for offsets
                    final RoadMapping.PolygonFloat polygon = roadMapping.mapFloat(vehicle, simulationTime);
                    path.reset();
                    path.moveTo(polygon.xPoints[0], polygon.yPoints[0]);
                    path.lineTo(polygon.xPoints[1], polygon.yPoints[1]);
                    path.lineTo(polygon.xPoints[2], polygon.yPoints[2]);
                    path.lineTo(polygon.xPoints[3], polygon.yPoints[3]);
                    path.closePath();
                    if (path.contains(transformedPoint)) {
                        // the mouse is over a vehicle
                        if (trafficCanvas.vehiclePopup == null
                                || trafficCanvas.vehiclePopup.getId() != vehicle.getId()) {
                            trafficCanvas.lastVehicleViewed = vehicle.getId();
                            // display popup
                            trafficCanvas.vehicleTipWindow.setVisible(false);
                            trafficCanvas.vehicleTipWindow.show(point, vehicle);
                        }
                        break;
                    }
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.MouseWheelListener#mouseWheelMoved(java.awt.event.MouseWheelEvent)
     */
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        final int notches = e.getWheelRotation();
        if (notches < 0) {
            logger.info("Mouse wheel moved UP " + -notches + " notch(es)");
            controller.commandZoomIn();
        } else {
            logger.info("Mouse wheel moved DOWN " + notches + " notch(es)");
            controller.commandZoomOut();
        }
    }
}
