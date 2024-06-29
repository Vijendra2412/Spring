package com.vjcoder.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){

        System.out.println("In constructor: " + getClass().getSimpleName());
    }
//
//    //define our init method
//    @PostConstruct
//    public void doMystartupStuff(){
//        System.out.println("In doMyStartupStuff(): "+ getClass().getSimpleName());
//    }
//
//    //define our destroy method
//    @PreDestroy
//    public void doMycleanupStuff(){
//        System.out.println("In doMycleanupStuff(): "+ getClass().getSimpleName());
//    }


    @Override
    public String getDailyWorkout(){
        return  "Practice fast bowling for 15 minutes";
    }

}
