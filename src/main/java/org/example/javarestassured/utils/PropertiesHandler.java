package org.example.javarestassured.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesHandler {
    private static Properties properties;

    public static Properties getProperties() {
        if (Objects.isNull(properties)) {
            try (FileInputStream inputStream = new FileInputStream("src/main/resources/app.properties")) {
                properties = new Properties();
                properties.load(inputStream);
            } catch (IOException e) {
                System.err.println("There was a problem with properties loading");
            }
        }
        return properties;
    }
}
