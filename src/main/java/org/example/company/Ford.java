package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) { super(cylinders, name); }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": EcoBoost ignition on";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": torque delivering";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": braking with poise";
    }
}
