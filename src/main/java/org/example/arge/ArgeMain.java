package org.example.arge;

public class ArgeMain {
    static void printType(CarSkeleton car) {
        System.out.println("Type: " + car.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        CarSkeleton gas = new GasPoweredCar("Roadster G", "Pure petrol fun", 14.5, 4);
        CarSkeleton ev  = new ElectricCar("Silent E", "Zero emission", 420, 82);
        CarSkeleton hyb = new HybridCar("Mix H", "Best of both", 22.0, 18, 4);

        printType(gas);
        System.out.println(gas.startEngine());
        System.out.println(gas.drive());

        printType(ev);
        System.out.println(ev.startEngine());
        System.out.println(ev.drive());

        printType(hyb);
        System.out.println(hyb.startEngine());
        System.out.println(hyb.drive());
    }
}
