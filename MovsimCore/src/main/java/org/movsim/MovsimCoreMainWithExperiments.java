/*
 * Copyright (C) 2010, 2011, 2012 by Arne Kesting, Martin Treiber, Ralph Germ, Martin Budden
 * <movsim.org@gmail.com>
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
package org.movsim;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.LineIterator;
import org.movsim.input.MovsimCommandLine;
import org.movsim.input.ProjectMetaData;
import org.movsim.logging.LogFileAppender;
import org.movsim.logging.Logger;
import org.movsim.simulator.Simulator;
import org.xml.sax.SAXException;

/**
 * The Class MovsimCoreMain.
 * 
 * MovSim core command line interface.
 * 
 */
public class MovsimCoreMainWithExperiments {

    private static int NUM_REPETITIONS = 10;

    private static String PATH_EXPERIMENT = "E:\\traffic-simulator\\experimentos";

    private static String[] NAME_EXPERIMENT = { "offramp-1.xprj", "offramp-2.xprj", "offramp-3.xprj", "offramp-4.xprj",
            "offramp-5.xprj" };

    private static String[] DO_EXPERIMENT = {};

    /**
     * The main method.
     * 
     * @param args
     *            the command line arguments
     * @throws SAXException
     * @throws JAXBException
     * @throws ParserConfigurationException
     */
    public static void main(String[] args) throws JAXBException, SAXException {

        int numExperiment = 0;

        Arrays.sort(DO_EXPERIMENT);

        for (String experimentName : NAME_EXPERIMENT) {
            numExperiment++;

            if (Arrays.binarySearch(DO_EXPERIMENT, experimentName) < 0) {
                for (int i = 1; i <= NUM_REPETITIONS; i++) {

                    String[] argsExp = new String[] { "-f", PATH_EXPERIMENT + "\\" + experimentName };

                    Locale.setDefault(Locale.US);

                    // final ProjectMetaData projectMetaData = ProjectMetaData.getInstance();
                    // parse the command line, putting the results into projectMetaData
                    Logger.initializeLogger();

                    MovsimCommandLine.parse(argsExp);

                    if (!ProjectMetaData.getInstance().hasProjectName()) {
                        System.err.println("no xml simulation configuration file provided.");
                        System.exit(-1);
                    }

                    LogFileAppender.initialize(ProjectMetaData.getInstance());

                    final Simulator simulator = new Simulator();
                    simulator.initialize();
                    simulator.runToCompletion();

                    String prefixFile = null;
                    Collection<File> lstFile = FileUtils.listFiles(new File("./"), new String[] { "csv" }, false);

                    File fRoute;
                    File fRouteDir = new File(PATH_EXPERIMENT + "\\" + numExperiment + "\\" + i);

                    boolean isFirstFile = false;

                    for (File file : lstFile) {

                        if (file.getName().startsWith(FilenameUtils.getBaseName(experimentName) + ".tt.route")
                                || file.getName().startsWith(
                                        FilenameUtils.getBaseName(experimentName) + ".consumption.route")) {

                            if (file.getName().startsWith(FilenameUtils.getBaseName(experimentName) + ".tt.route")) {
                                prefixFile = ".tt.route";
                            } else {
                                prefixFile = ".consumption.route";
                            }

                            fRoute = new File(PATH_EXPERIMENT + "\\" + numExperiment + "\\" + i + "\\"
                                    + FilenameUtils.getBaseName(experimentName) + prefixFile + ".csv");

                            if (!fRoute.exists()) {
                                try {
                                    isFirstFile = true;
                                    FileUtils.forceMkdir(fRouteDir);
                                    fRoute.createNewFile();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            try {
                                appendFiles(file, fRoute, isFirstFile);
                                isFirstFile = false;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            try {
                                FileUtils.moveFile(file, new File(PATH_EXPERIMENT + "\\" + numExperiment + "\\" + i
                                        + "\\src\\" + file.getName()));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    private static void appendFiles(File src, File dst, boolean writeFirstLine) throws IOException {

        LineIterator lIter = FileUtils.lineIterator(src);
        RandomAccessFile rFile = new RandomAccessFile(dst, "rw");

        rFile.seek(dst.length());

        long lineCount = 1;
        while (lIter.hasNext()) {
            String line = lIter.next();

            if (lineCount > 1 || writeFirstLine) {
                rFile.write((line + "\n").getBytes());
            }
            lineCount++;
        }
        lIter.close();
        rFile.close();
    }
}
