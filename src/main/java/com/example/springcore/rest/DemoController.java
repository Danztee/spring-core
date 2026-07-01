package com.example.springcore.rest;

import com.example.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }


    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
