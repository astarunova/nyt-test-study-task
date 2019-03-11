package tests;

import java.util.Properties;
import java.util.logging.Logger;

public class Configuration {
    Logger log = Logger.getLogger(Configuration.class.getName());

    public static Properties confProperties() {
        Properties prop = new Properties();
        try {
            prop.load(Configuration.class.getResourceAsStream("/config.properties"));
        } catch (Exception e) {
            System.err.println("File does not exist");
        }
        return prop;
    }

    public void setProp(String keyToSet, String valueToSet) {
        confProperties().setProperty(keyToSet, valueToSet);
    }

    public Properties getProps() {
       log.info(confProperties().size() + " properties found:");
        return confProperties();
    }

    public String getProp(String propertyKey) {
        return confProperties().getProperty(propertyKey);
    }

}

