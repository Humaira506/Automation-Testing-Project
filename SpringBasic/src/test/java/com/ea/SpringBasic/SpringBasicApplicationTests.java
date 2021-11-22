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
@Profile("!qa")
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
	void contextLoads() {

		System.out.println(environment);
		System.out.println(appurl);
		// method reference in java to print list of values
		browswes.forEach(System.out::println);

	//	ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class);
		//Car car = applicationContext.getBean(Car.class);
		//car.getCar();

		//System.out.println("Hello");
		//HomePage homepage = new HomePage();
		//LoginPage loginpage = new LoginPage();
		//HomePage page = new HomePage();
		//page.ClickLogin();

		//LoginPage logpage = page.ClickLogin();
		//logpage.ClickLogin();

		//MainPage mainPage = new MainPage(loginpage,homepage);
		mainPage.PerformLogin();
	}

}
