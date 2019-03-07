import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.*;

public class Configuration {

    public static Properties confProperties() {
        Properties prop = new Properties();
        try {
            prop.load(Configuration.class.getResourceAsStream("config.properties"));
        } catch (Exception e) {
            System.err.println("File does not exist");
        }
        return prop;
    }

    public static void setProp(String keyToSet, String valueToSet) {
        confProperties().setProperty(keyToSet, valueToSet);
    }

    public static Properties getProps() {
        System.out.println(confProperties().size() + " properties found:");
        return confProperties();
    }

    public static String getProp(String propertyKey) {
        return confProperties().getProperty(propertyKey);
    }

}

