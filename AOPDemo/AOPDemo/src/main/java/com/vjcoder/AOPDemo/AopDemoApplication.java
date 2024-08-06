package com.vjcoder.AOPDemo;

import com.vjcoder.AOPDemo.dao.Accountdao;
import com.vjcoder.AOPDemo.dao.MembershipDAO;
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
	public CommandLineRunner commandLineRunner(Accountdao theAccountDAO , MembershipDAO theMembershipDAO){
		return runner ->{
			demoTheBeforeAdvice(theAccountDAO , theMembershipDAO);
		};

	}

	private void demoTheBeforeAdvice(Accountdao theAccountDAO ,MembershipDAO theMembershipDAO) {

		//call the business method
		theAccountDAO.addAccount();

		// call the membership business method
		theMembershipDAO.addSillyMember();

		/*

		//do it again
		System.out.println("\n let's call it again!\n");

		//call the business method
		theAccountDAO.addAccount();

		 */
	}

}















