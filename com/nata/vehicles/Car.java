package com.nata.vehicles;

import com.nata.DayChecker;
import com.nata.Movable;

/**
 * Created by nata on 19.04.2017.
 */
public class Car implements Movable {

    private double getSpeed(){return DayChecker.isDayNow()?100:60;}

    @Override
    public void move(int distance) {
        System.out.println("Car goes for "+distance+" with speed "+getSpeed());
    }
}
