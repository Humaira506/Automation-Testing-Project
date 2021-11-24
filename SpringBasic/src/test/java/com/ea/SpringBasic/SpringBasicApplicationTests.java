package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("qa")
class SpringBasicApplicationTests {
	@Autowired
	private  MainPage mainPage;
	@Value("testing")
	private  String environment;
	@Value("${app.url}")
	private String appurl;
	@Value("chrome,firefox,edge")
	private List<String> browswes;
	@Test
	void performLoginTest() {
	//	mainPage.navigate();
		mainPage.PerformLogin();
	}

}
