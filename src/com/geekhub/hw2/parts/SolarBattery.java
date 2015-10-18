package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

public class SolarBattery implements EnergySource {
    private double capacity;

    public SolarBattery(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public Energy get() {
        int energy = (int) Math.round(capacity * 2);
        return new Energy(energy * 3);
    }
}
