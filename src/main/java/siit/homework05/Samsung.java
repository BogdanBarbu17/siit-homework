package siit.homework05;

public abstract class Samsung extends Phone {

    public Samsung(String color, String material, String imei) {
        super(color, material, imei);
        this.batteryLife = 12;
    }

}
