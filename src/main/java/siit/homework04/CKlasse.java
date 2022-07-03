package siit.homework04;

public class CKlasse extends Mercedes {


    public CKlasse(double availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelType = "Diesel";
        this.consumptionPer100Km = 5.7;
        this.nrOfGears = 5;
        this.fuelTankSize = 70;
    }

    @Override
    public void drive(double km) {
        double consumedFuel = km * (consumptionPer100Km  * Math.pow(1.1,nrOfGears - currentGear))/ 100;
        availableFuel = availableFuel - consumedFuel;
        System.out.println("The car covered the distance of " + km + " kilometers");
        System.out.println("Car consumed " + consumedFuel + " fuel!");
        totalConsumedFuel += consumedFuel;
        tripTotalDistance += km;
    }


    @Override
    public String toString() {
        return "CKlasse{" +
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
