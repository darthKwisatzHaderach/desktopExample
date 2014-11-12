package com.desktopexample.steps;

import com.desktopexample.screens.LoginScreen;
import com.desktopexample.screens.MainScreen;
import com.desktopexample.utils.DataProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Тогда;
import static org.junit.Assert.assertTrue;
import org.sikuli.script.App;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dmitriy
 */
public class LoginStepDefs {
    
    private MainScreen main;
    private LoginScreen login;

    @Допустим("^В окне авторизации пользователь вводит имя \"(.*?)\" и пароль \"(.*?)\"$")
    public void в_окне_авторизации_пользователь_вводит_имя_и_пароль(String username, String password) throws Throwable {
        login = new LoginScreen();
        login.enterLoginData(username, password);
    }

    @Допустим("^Нажимает кнопку Войти$")
    public void нажимает_кнопку_Войти() throws Throwable {
        main = login.clickLogIn();
    }

    @Допустим("^Открывается главное окно программы$")
    public void открывается_главное_окно_программы() throws Throwable {
        assertTrue(main.isTitleCorrect());
    }
}
