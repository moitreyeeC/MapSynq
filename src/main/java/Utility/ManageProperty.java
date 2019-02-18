package Utility;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.util.Properties;


public class ManageProperty {
	private static final String PROP_FILE = "/mapSynq.properties";
	private final static Properties properties = new Properties();
    
	ManageProperty() {
	    	
    }

    public static String getValue(final String key) {
    	
   
		try {
			properties.load(ManageProperty.class.getResourceAsStream(PROP_FILE));
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
		return properties.getProperty(key);
	}

	public static boolean getBoolean(final String key) {
		return parseBoolean(getValue(key));
	}

	public static int getInt(final String key) {
		return parseInt(getValue(key));
	}

}
