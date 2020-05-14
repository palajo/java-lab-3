package ua.lviv.iot.model;

public abstract class AbstractWartechnic {

    int engineVolume;
    double fuelConsumption;
    int maxSpeed;
    int passengersCapacity;
    double fireRange;
    Levels damage;
    int armorType;

    public AbstractWartechnic(int engineVolume, double fuelConsumption, int maxSpeed, int passengersCapacity,
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

    public final int getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(final int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public final double getFuelConsumption() {
        return fuelConsumption;
    }

    public final void setFuelConsumption(final double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public final int getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public final int getPassengersCapacity() {
        return passengersCapacity;
    }

    public final void setPassengersCapacity(final int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public final double getFireRange() {
        return fireRange;
    }

    public final void setFireRange(final double fireRange) {
        this.fireRange = fireRange;
    }

    public Levels getDamage() {
        return damage;
    }

    public void setDamage(Levels damage) {
        this.damage = damage;
    }

    public final int getArmorType() {
        return armorType;
    }

    public final void setArmorType(final int armorType) {
        this.armorType = armorType;
    }


    public String getHeaders() {
        return "engineVolume" + "," + "fuelConsumption" + "," + "maxSpeed" + "," + "passengersCapacity"
                + "," + "fireRange" + "," + "damage" + "," + "armorType";
    }

    public String toCSV() {
        return getEngineVolume() + ","
                + getFuelConsumption() + ","
                + getMaxSpeed() + ","
                + getPassengersCapacity() + ","
                + getFuelConsumption() + ","
                + getArmorType();
    }

}