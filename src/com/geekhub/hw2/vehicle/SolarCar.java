package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.CarGear;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.parts.SolarBattery;
import com.geekhub.hw2.parts.SolarEngine;

public class SolarCar extends Car {

    public SolarCar(double capacityBattery) {
        super(new SolarBattery(capacityBattery), new SolarEngine(), new CarGear());
    }

    @Override
    public void accelerate() {
        System.out.print("solar ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.print("solar ");
        super.turn(direction);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
