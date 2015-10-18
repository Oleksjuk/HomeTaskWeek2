package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.CarGear;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public class Car extends Vehicle {
    public Car(EnergySource energySource, Engine engine, CarGear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("car accelerated");
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("car ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
