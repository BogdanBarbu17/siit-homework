package siit.homework04;

public class VWPassat extends Volkswagen{


    public VWPassat(double availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelType = "Diesel";
        this.consumptionPer100Km = 4.7;
        this.nrOfGears = 5;
        this.fuelTankSize = 70;
    }

    @Override
    public String toString() {
        return "VWPassat{" +
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
