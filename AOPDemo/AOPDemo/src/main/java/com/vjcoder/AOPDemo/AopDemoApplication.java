package com.vjcoder.AOPDemo;

import com.vjcoder.AOPDemo.dao.Accountdao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(AopDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(Accountdao theAccountDAO){
		return runner ->{
			demoTheBeforeAdvice(theAccountDAO);
		};

	}

	private void demoTheBeforeAdvice(Accountdao theAccountDAO) {
		//call the business method
		theAccountDAO.addAccount();
	}

}















