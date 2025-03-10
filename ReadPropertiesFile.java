package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            prop.load(fis);
            System.out.println("Property Value: " + prop.getProperty("username"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}