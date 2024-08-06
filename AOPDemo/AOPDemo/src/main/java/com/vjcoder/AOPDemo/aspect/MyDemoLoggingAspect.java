package com.vjcoder.AOPDemo.aspect;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    //this is where we add all of our related adviced for logging

    //let start with an @Before advice
// 2.
//   @Before("execution(public void com.vjcoder.AOPDemo.dao.Accountdao.addAccount())")

//1.
//    @Before("execution(public void updateAccount())")

    //3.
    @Before("execution(* add*())")

    public void beforeAddAccountAdvice(){
        System.out.println("\n====> Executing @Before advice on method");

    }
}

















