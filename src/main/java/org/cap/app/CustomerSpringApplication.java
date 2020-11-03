package org.cap.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.cap.app.ui.*;

@EnableTransactionManagement
@SpringBootApplication
public class CustomerspringJPA {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerspringJPA.class, args);
		ProjectUi projectui = context.getBean(ProjectUi.class);
		projectui.run();
		context.close();
	}

}
