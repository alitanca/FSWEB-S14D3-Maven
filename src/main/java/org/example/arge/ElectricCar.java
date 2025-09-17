package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private final double avgKmPerCharge;
    private final int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() { return avgKmPerCharge; }
    public int getBatterySize() { return batterySize; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": inverter online, motors armed";
    }

    @Override
    public String drive() {
        String run = runEngine();
        return getClass().getSimpleName() + ": silent EV glide | " + run;
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + ": motors spinning, range ~" + avgKmPerCharge + " km (" + batterySize + " kWh)";
    }
}
