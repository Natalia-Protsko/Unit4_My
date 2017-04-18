package com.nata.animals;

import com.nata.Movable;

/**
 * Created by nata on 19.04.2017.
 */
public abstract class Animal implements Movable {
    double speed;
    public Animal(){this.speed = 0;}
    public Animal(double speed){setSpeed(speed);}
    void setSpeed(double speed){this.speed = speed;}
}
