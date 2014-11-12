/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.screens;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import com.desktopexample.utils.DataProperties;

/**
 *
 * @author dmitriy
 */
public class MainScreen extends AbstractScreen {

    private Pattern mainWindow;
    private Pattern mainWindowTitle;
    
    private Region window;

    public MainScreen() throws FindFailed {
        mainWindow = new Pattern(ClassLoader.getSystemResource("pics\\MainWindow.png"));
        mainWindowTitle = new Pattern(ClassLoader.getSystemResource("pics\\MainWindowTitle.png"));        
        
        window = getDriver().wait(mainWindow.similar((float)0.30), 5);
    }

    public boolean isTitleCorrect() throws FindFailed {
        try {
            window.wait(mainWindowTitle, 5);
            return true;
        } catch (FindFailed e) {
            return false;
        }        
    }
}
