package ua.lviv.iot.model;

public class BTR extends AbstractWartechnic {

    int wheelsQuantity;

    double trunkCapacity;

    public BTR(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
               final double fireRange, final int armorType, final int wheelsQuantity,
               final double trunkCapacity) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, armorType);
        this.wheelsQuantity = wheelsQuantity;
        this.trunkCapacity = trunkCapacity;
    }

    public BTR() {
    }

    public final int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public final void setWheelsQuantity(final int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
    }

    public final double getTrunkCapacity() {
        return trunkCapacity;
    }

    public final void setTrunkCapacity(final double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

}