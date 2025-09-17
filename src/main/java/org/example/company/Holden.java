package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) { super(cylinders, name); }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": V6 rumbling to life";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": picking up speed";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": steady stop engaged";
    }
}
