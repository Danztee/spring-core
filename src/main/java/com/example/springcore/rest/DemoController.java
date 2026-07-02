package com.example.springcore.rest;

import com.example.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;
//    private Coach anotherCoach;
//
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }


    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
//       anotherCoach = theAnotherCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//    }
}
