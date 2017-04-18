package com.nata.animals;

/**
 * Created by nata on 19.04.2017.
 */
public class Mammal extends Animal {

    public Mammal(double speed){super (speed);}

    @Override
    public void move(int distance) {
        System.out.println("Mammals runs for "+distance+" with speed "+speed);
    }
}


