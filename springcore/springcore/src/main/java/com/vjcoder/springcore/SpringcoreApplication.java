//1.constructor injection
//2.component Scanning
//3.Setter injection
//4.field injection
//5.@Qualifier
//6.@Primary
//7.Lazy Initialization

package com.vjcoder.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.vjcoder.springcore"
//		,"com.vjcoder.util"
//		})

/*
singleton:- Create a single shared instance of the bean. default scope
prototype:- Creates a new bean instance for each container request
request:- Scoped to an Http web reqst. only used for web apps
session:- Scoped to an htpp web session . only used for web apps
application:- Scoped to a web app ServletContext. oly used for web apps
websocket:- scoped to a web socket. only used for web apps
*/

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
