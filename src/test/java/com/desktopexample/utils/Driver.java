/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.utils;

import org.sikuli.script.Screen;

/**
 *
 * @author dmitriy
 */
public class Driver {

    private static Screen driver;

    public synchronized static Screen getInstance() {
        if (driver == null) {
            driver = new Screen();
        }
        return driver;
    }
}
