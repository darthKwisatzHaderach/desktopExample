/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desktopexample.screens;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import com.desktopexample.utils.DataProperties;
import org.sikuli.script.Key;

/**
 *
 * @author dmitriy
 */
public class LoginScreen extends AbstractScreen {

    private Pattern username;
    private Pattern password;
    private Pattern loginButton;    
    private Pattern loginWindow;
    private Region window;

    public LoginScreen() throws FindFailed {
        username = new Pattern(ClassLoader.getSystemResource("pics\\Username.png"));
        password = new Pattern(ClassLoader.getSystemResource("pics\\Password.png"));
        loginButton = new Pattern(ClassLoader.getSystemResource("pics\\LoginButton.png"));
        loginWindow = new Pattern(ClassLoader.getSystemResource("pics\\AuthenticationWindow.png"));        

        window = getDriver().wait(loginWindow, 20);
    }

    public LoginScreen enterLoginData(String user, String pass) throws FindFailed {
        window.paste(username, user);
        window.type(Key.ENTER);
        window.paste(password, pass);        
        return this;
    }

    public MainScreen clickLogIn() throws FindFailed {
        window.click(loginButton);          
	return new MainScreen();
    }        

}
