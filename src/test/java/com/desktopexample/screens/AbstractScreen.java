/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.screens;

import org.sikuli.script.Screen;
import com.desktopexample.utils.Driver;

/**
 *
 * @author dmitriy
 */
public class AbstractScreen {
    	//protected final static double WIN_TIMEOUT = Double.parseDouble(DataProperties.get("window.timeout"));
	//protected final static double CTL_TIMEOUT = Double.parseDouble(DataProperties.get("control.timeout"));
	
	protected Screen getDriver() {
		return Driver.getInstance();
	}
}
