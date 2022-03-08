package org.example.labs.lab7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ApplicationProperties {
    private static final Logger LOGGER = LoggerFactory.getLogger(org.example.labs.lab6.ApplicationProperties.class);
    private static final String FILE_NAME = "/application.properties";

    private static ApplicationProperties instance;

    private final Properties properties = new Properties();

    private void init() {
        try (InputStream is = getClass().getResourceAsStream(FILE_NAME)) {
            if(Objects.nonNull(is)) {
                properties.load(is);
            }
        } catch (IOException e) {
            LOGGER.info(e.getMessage(), e);
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public static ApplicationProperties getInstance() {
        if(Objects.isNull(instance)) {
            instance = new ApplicationProperties();
            instance.init();
        }
        return instance;
    }
}
