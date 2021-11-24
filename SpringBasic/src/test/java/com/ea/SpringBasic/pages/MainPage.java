package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
//@ConditionalOnProperty(name ="env", havingValue = "qa")
public class MainPage extends BasePage {

    @Autowired
    private HomePage homepage;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private WebDriver webDriver;

    public  void PerformLogin(){
        homepage.ClickLogin();
        loginPage.Login("admin","password");
        loginPage.ClickLogin();
    }


}