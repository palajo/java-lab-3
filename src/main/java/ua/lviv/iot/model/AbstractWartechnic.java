package ua.lviv.iot.model;

public class AbstractWartechnic {
    double engineVolume;
    double fuelConsumption;
    int maxSpeed;
    int passengersCapacity;
    double fireRange;
    Levels damage;
    int armorType;

    public AbstractWartechnic(double engineVolume, double fuelConsumption, int maxSpeed, int passengersCapacity,
                              double fireRange, Levels damage, int armorType) {
        this.engineVolume = engineVolume;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.passengersCapacity = passengersCapacity;
        this.fireRange = fireRange;
        this.damage = damage;
        this.armorType = armorType;
    }

    public AbstractWartechnic() {
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public double getFireRange() {
        return fireRange;
    }

    public void setFireRange(double fireRange) {
        this.fireRange = fireRange;
    }

    public Levels getDamage() {
        return damage;
    }

    public void setDamage(Levels damage) {
        this.damage = damage;
    }

    public int getArmorType() {
        return armorType;
    }

    public void setArmorType(int armorType) {
        this.armorType = armorType;
    }
}
