package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private final double avgKmPerLitre;
    private final int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getCylinders() { return cylinders; }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": fuel pump priming, spark plugs firing";
    }

    @Override
    public String drive() {
        String run = runEngine();
        return getClass().getSimpleName() + ": cruising on petrol | " + run;
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + ": ICE running @ " + avgKmPerLitre + " km/L, " + cylinders + " cyl";
    }
}
