package com.vjcoder.springcore.rest;

import com.vjcoder.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private filed for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

//    private Coach anotherCoach;
//
//    @Autowired
//    public void DemoController(
//            @Qualifier("cricketCoach") Coach theCoach
//            ,@Qualifier("cricketCoach") Coach theanotherCoach
//    ) {
//        System.out.println("In Constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//
//        anotherCoach = theanotherCoach;
//    }


//    @Autowired
//    public void DemoController(
//            @Qualifier("aquatic") Coach theCoach
//
//    ) {
//        System.out.println("In Constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: mycoach == anothercoach , " + (myCoach == anotherCoach);
//    }
//
//}
