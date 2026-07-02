package com.example.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

//    define our init method
    @PostConstruct
    public void doMyStuff() {
        System.out.println("Do our stuff here");
    }

    //    define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("Destroying things");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins.";
    }
}
