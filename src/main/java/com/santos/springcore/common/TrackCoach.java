package com.santos.springcore.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run for a 5k!";
    }
}
