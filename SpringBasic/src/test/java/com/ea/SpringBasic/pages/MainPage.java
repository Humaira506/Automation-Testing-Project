package com.ea.SpringBasic.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name ="env", havingValue = "qa")
public class MainPage {

    public MainPage(){
        System.out.println("In Main Page");
    }
    @Autowired
    private HomePage homepage;
    @Autowired
    private LoginPage loginPage;
   // public MainPage(LoginPage loginPage,HomePage homepage) {
       // this.loginPage=loginPage;
      //  this.homepage = homepage;

  //  }

    public  void PerformLogin(){
        homepage.ClickLogin();
        loginPage.Login("admins","password123456");
        loginPage.ClickLogin();
    }


}