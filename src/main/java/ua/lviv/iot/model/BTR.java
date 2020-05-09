package ua.lviv.iot.model;

import ua.lviv.iot.manager.WartechnicManager;

public class BTR extends AbstractWartechnic {

    int wheelsQuantity;

    double trunkCapacity;

    public BTR(double engineVolume, double fuelConsumption, int maxSpeed, int passengersCapacity, double fireRange,
               Levels damage, int armorType, int wheelsQuantity, double trunkCapacity) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.wheelsQuantity = wheelsQuantity;
        this.trunkCapacity = trunkCapacity;
    }

    public BTR() {
    }

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public void setWheelsQuantity(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

}