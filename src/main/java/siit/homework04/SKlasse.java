package siit.homework04;

public class SKlasse extends Mercedes{


    public SKlasse(double availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelType = "Petrol";
        this.consumptionPer100Km = 7.7;
        this.nrOfGears = 6;
        this.fuelTankSize = 50;
    }

    @Override
    public void drive(double km){
        double increaseConsumptionBy = 1.1;
        if (tireSize > 15){
            double consumedFuel = km * (consumptionPer100Km * increaseConsumptionBy) / 100;
            availableFuel = availableFuel - consumedFuel;
            System.out.println("The car covered the distance of " + km + " kilometers");
            System.out.println("Car consumed " + consumedFuel + " fuel!");
            totalConsumedFuel += consumedFuel;
            tripTotalDistance += km;
        }
    }




    @Override
    public String toString() {
        return "SKlasse{" +
                "availableFuel=" + availableFuel +
                ", tireSize=" + tireSize +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", fuelTankSize=" + fuelTankSize +
                ", consumptionPer100Km=" + consumptionPer100Km +
                ", nrOfGears=" + nrOfGears +
                '}';
    }
}
