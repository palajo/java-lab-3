package ua.lviv.iot.model;

public class Artillery extends AbstractWartechnic {

    int rocketsQuantity;

    public Artillery(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                     final double fireRange, final Levels damage, final int armorType, final int rocketsQuantity) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.rocketsQuantity = rocketsQuantity;
    }

    public Artillery() {
    }

    public final int getRocketsQuantity() {
        return rocketsQuantity;
    }

    public final void setRocketsQuantity(final int rocketsQuantity) {
        this.rocketsQuantity = rocketsQuantity;
    }

}
