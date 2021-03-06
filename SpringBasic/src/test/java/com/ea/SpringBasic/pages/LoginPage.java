package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.CSS, using = ".btn-default")
    public  WebElement btnLogin;

    public void Login(String userName,String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        //System.out.println("UserName and Password"+ userName +"------"+password);
    }
    public HomePage ClickLogin(){
        btnLogin.click();
       // System.out.println("Click login on login page");
        return new HomePage();
    }
}
