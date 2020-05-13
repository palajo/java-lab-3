package ua.lviv.iot.model;

public class AbstractWartechnic {

    private int engineVolume;
    private double fuelConsumption;
    private int maxSpeed;
    private int passengersCapacity;
    private double fireRange;
    private Levels damage;
    private int armorType;

    public AbstractWartechnic(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                              final double fireRange, final Levels damage, final int armorType) {
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

    public final Levels getDamage() {
        return damage;
    }

    public final void setDamage(final Levels damage) {
        this.damage = damage;
    }

    public final int getArmorType() {
        return armorType;
    }

    public final void setArmorType(final int armorType) {
        this.armorType = armorType;
    }


    public String getHeaders() {
        return "engineVolume" + "," + " fuelConsumption " + "," + " maxSpeed" + "," + " passengersCapacity"
                + "," + "fireRange" + "," + "damage" + "," + "armorType" + ".";
    }

    public String toCSV() {
        return    "engineVolume = " + getEngineVolume() + ","
                + " fuelConsumption = " + getFuelConsumption() + ","
                + " maxSpeed = " + getMaxSpeed() + ","
                + " passengersCapacity = " + getPassengersCapacity()
                + " fireRange = " + getFuelConsumption() + ","
                + " damage = " + getDamage() + ","
                + " armorType = " + getArmorType();
    }


}
