package com.in28minutes.learnspringframework.SpringGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.in28minutes.learnspringframework.SpringGame")
public class GameHomePage {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GameHomePage.class);
		
		context.getBean(GameRunner.class).run();
		
		

	}

}
