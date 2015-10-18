package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.BoatGear;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;

public class Boat extends Vehicle{

    public Boat(EnergySource energySource, Engine engine, BoatGear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("boat accelerated");
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("boat ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
