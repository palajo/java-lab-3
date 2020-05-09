package ua.lviv.iot.model;

public class Artillery extends AbstractWartechnic {

    int rocketsQuantity;

    public Artillery(int engineVolume, double fuelConsumption, int maxSpeed, int passengersCapacity,
                     double fireRange, Levels damage, int armorType, int rocketsQuantity) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.rocketsQuantity = rocketsQuantity;
    }

    public Artillery(){
    }

    public int getRocketsQuantity() {
        return rocketsQuantity;
    }

    public void setRocketsQuantity(int rocketsQuantity) {
        this.rocketsQuantity = rocketsQuantity;
    }

}
