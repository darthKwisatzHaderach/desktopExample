/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 *
 * @author dmitriy
 */
public class DataProperties {

    private static Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("properties\\data.properties");        
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static String get(String key) {
        //just to use short name
        return getProperty(key);
    }

    public static String getPathFor(String file) {
		// Using substring for full path to remove first slash.
        // Sikuli bug on Windows
        URL path = ClassLoader.getSystemResource(file);
        return path.toString();
    }

}
