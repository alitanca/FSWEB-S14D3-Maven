package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() { }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    public String startEngine() {
        return getClass().getSimpleName() + ": base engine start";
    }

    public String drive() {
        String run = runEngine();
        return getClass().getSimpleName() + ": driving | " + run;
    }

    protected String runEngine() {
        return getClass().getSimpleName() + ": engine running";
    }
}
