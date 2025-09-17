package org.example.arge;

public class HybridCar extends CarSkeleton {
    private final double avgKmPerLitre;
    private final int batterySize;
    private final int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }
    public int getCylinders() { return cylinders; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": blending EV and ICE systems";
    }

    @Override
    public String drive() {
        String run = runEngine();
        return getClass().getSimpleName() + ": smart split drive | " + run;
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName()
                + ": EV assist (" + batterySize + " kWh) + ICE " + cylinders + " cyl @ "
                + avgKmPerLitre + " km/L";
    }
}
