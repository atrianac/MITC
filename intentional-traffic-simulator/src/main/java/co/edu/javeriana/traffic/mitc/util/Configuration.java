/********************************************************************
 * Copyleft. 2010
 * Pontificial Universidad Javeriana.
 * Maestria Ingenieria de Sistemas y Computacion.
 **********************************************************************/
package co.edu.javeriana.traffic.mitc.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * <p>
 * Configuracion para la simulacion
 * <p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 * 
 */
public class Configuration {

	private static org.apache.commons.configuration.Configuration _conf;

	public static final Configuration instance;

	static {
		instance = new Configuration();
	}

	public static synchronized void setupConfiguration(String path) {
		try {
			_conf = new PropertiesConfiguration(path);
		} catch (Exception e) {
		}
	}

	private Configuration() {
	}

	public void addProperty(String arg0, Object arg1) {
		_conf.addProperty(arg0, arg1);
	}

	public void clear() {
		_conf.clear();
	}

	public void clearProperty(String arg0) {
		_conf.clearProperty(arg0);
	}

	public boolean containsKey(String arg0) {
		return _conf.containsKey(arg0);
	}

	public BigDecimal getBigDecimal(String arg0, BigDecimal arg1) {
		return _conf.getBigDecimal(arg0);
	}

	public BigDecimal getBigDecimal(String arg0) {
		return _conf.getBigDecimal(arg0);
	}

	public BigInteger getBigInteger(String arg0, BigInteger arg1) {
		return _conf.getBigInteger(arg0);
	}

	public BigInteger getBigInteger(String arg0) {
		return _conf.getBigInteger(arg0);
	}

	public boolean getBoolean(String arg0, boolean arg1) {
		return _conf.getBoolean(arg0, arg1);
	}

	public Boolean getBoolean(String arg0, Boolean arg1) {
		return _conf.getBoolean(arg0, arg1);
	}

	public boolean getBoolean(String arg0) {
		return _conf.getBoolean(arg0);
	}

	public byte getByte(String arg0, byte arg1) {
		return _conf.getByte(arg0, arg1);
	}

	public Byte getByte(String arg0, Byte arg1) {
		return _conf.getByte(arg0, arg1);
	}

	public byte getByte(String arg0) {
		return _conf.getByte(arg0);
	}

	public double getDouble(String arg0, double arg1) {
		return _conf.getDouble(arg0, arg1);
	}

	public Double getDouble(String arg0, Double arg1) {
		return _conf.getDouble(arg0, arg1);
	}

	public double getDouble(String arg0) {
		return _conf.getDouble(arg0);
	}

	public float getFloat(String arg0, float arg1) {
		return _conf.getFloat(arg0, arg1);
	}

	public Float getFloat(String arg0, Float arg1) {
		return _conf.getFloat(arg0, arg1);
	}

	public float getFloat(String arg0) {
		return _conf.getFloat(arg0);
	}

	public int getInt(String arg0, int arg1) {
		return _conf.getInt(arg0, arg1);
	}

	public int getInt(String arg0) {
		return _conf.getInt(arg0);
	}

	public Integer getInteger(String arg0, Integer arg1) {
		return _conf.getInteger(arg0, arg1);
	}

	@SuppressWarnings("unchecked")
	public Iterator getKeys() {
		return _conf.getKeys();
	}

	@SuppressWarnings("unchecked")
	public Iterator getKeys(String arg0) {
		return _conf.getKeys(arg0);
	}

	@SuppressWarnings("unchecked")
	public List getList(String arg0, List arg1) {
		return _conf.getList(arg0, arg1);
	}

	@SuppressWarnings("unchecked")
	public List getList(String arg0) {
		return _conf.getList(arg0);
	}

	public long getLong(String arg0, long arg1) {
		return _conf.getLong(arg0, arg1);
	}

	public Long getLong(String arg0, Long arg1) {
		return _conf.getLong(arg0, arg1);
	}

	public long getLong(String arg0) {
		return _conf.getLong(arg0);
	}

	public Properties getProperties(String arg0) {
		return _conf.getProperties(arg0);
	}

	public Object getProperty(String arg0) {
		return _conf.getProperty(arg0);
	}

	public short getShort(String arg0, short arg1) {
		return _conf.getShort(arg0, arg1);
	}

	public Short getShort(String arg0, Short arg1) {
		return _conf.getShort(arg0, arg1);
	}

	public short getShort(String arg0) {
		return _conf.getShort(arg0);
	}

	public String getString(String arg0, String arg1) {
		return _conf.getString(arg0);
	}

	public String getString(String arg0) {
		return _conf.getString(arg0);
	}

	public String[] getStringArray(String arg0) {
		return _conf.getStringArray(arg0);
	}

	public boolean isEmpty() {
		return _conf.isEmpty();
	}

	public void setProperty(String arg0, Object arg1) {
		_conf.setProperty(arg0, arg1);
	}

	public org.apache.commons.configuration.Configuration subset(String arg0) {
		return _conf.subset(arg0);
	}
}
