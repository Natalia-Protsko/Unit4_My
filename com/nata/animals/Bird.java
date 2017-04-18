package com.nata.animals;

/**
 * Created by nata on 19.04.2017.
 */
public class Bird extends Animal {

    public Bird(double speed){super (speed);}

    @Override
    public void move(int distance) {
        System.out.println("Bird flyes for "+distance+" with speed "+speed);
    }
}
