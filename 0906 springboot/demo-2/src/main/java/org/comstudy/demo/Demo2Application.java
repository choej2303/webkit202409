package org.comstudy.demo;

//import org.comstudy.demo.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Demo2Application.class, args);
//		빈을 DL(룩업)을 통해서 사용할 수 있다.
//		HomeController homeController = applicationContext.getBean(HomeController.class);
//		homeController.execute();
	}

}
