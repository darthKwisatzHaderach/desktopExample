/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.steps;

import com.desktopexample.utils.DataProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;

/**
 *
 * @author dmitriy
 */
public class BaseSteps {

    private static App armi;

    @Before
    public static void setUp() throws InterruptedException, FindFailed {
        armi = App.open(DataProperties.get("ARMI.path"));
    }

    @After
    public static void tearDown() {
        armi.close();
    }
}
