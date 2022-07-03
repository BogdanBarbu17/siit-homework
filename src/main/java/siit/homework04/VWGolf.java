package siit.homework04;

public class VWGolf extends Volkswagen {

    public VWGolf(double availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelType = "Petrol";
        this.consumptionPer100Km = 6.7;
        this.nrOfGears = 6;
        this.fuelTankSize = 50;
    }


    @Override
    public String toString() {
        return "VWGolf{" +
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


