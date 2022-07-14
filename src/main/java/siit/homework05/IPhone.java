package siit.homework05;

public abstract class IPhone extends Phone {

    public IPhone(String color, String material, String imei) {
        super(color, material, imei);
        this.batteryLife = 12;
    }

}
