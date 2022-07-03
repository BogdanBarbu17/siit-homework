package siit.homework04;

public abstract class Car implements Vehicle {

    public double availableFuel;
    public int tireSize;
    public String chassisNumber;
    public String fuelType;
    public double fuelTankSize;
    public double consumptionPer100Km;
    public int nrOfGears;

    public Car(double availableFuel, int tireSize, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
    }


    double totalConsumedFuel;
    double tripTotalDistance;

    public void start() {
        System.out.println("The car has started!");
        totalConsumedFuel = 0;
        tripTotalDistance = 0;
        System.out.println("The car has consumed " + totalConsumedFuel + " fuel");
    }


    public void drive(double km) {
        double consumedFuel = km * consumptionPer100Km / 100;
        availableFuel = availableFuel - consumedFuel;
        System.out.println("The car covered the distance of " + km + " kilometers");
        System.out.println("Car consumed " + consumedFuel + " fuel!");
        totalConsumedFuel += consumedFuel;
        tripTotalDistance += km;
    }


    int currentGear = 1;

    public void shiftGear(int gear) {
        currentGear = gear;
        System.out.println("The car has changed gear !");
        System.out.println("The car is nou in " + currentGear + " gear !");
    }

    public void stop() {
        System.out.println("The car has stopped !");
        System.out.println("Total trip consumption is " + totalConsumedFuel);
    }

    public void refuel() {
        availableFuel = fuelTankSize;
        System.out.println("The fuel tank is now full !");
    }

    public void averageFuelConsumption(){
        double averageConsumption = totalConsumedFuel * 100 / tripTotalDistance;
        System.out.println("The average fuel consumption for the trip is " + averageConsumption);
    }


}
