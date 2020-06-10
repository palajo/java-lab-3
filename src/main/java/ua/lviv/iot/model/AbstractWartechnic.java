package ua.lviv.iot.model;


import javax.management.MXBean;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractWartechnic {

    private int engineVolume;
    private double fuelConsumption;
    private int maxSpeed;
    private int passengersCapacity;
    private double fireRange;
    private int armorType;
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    public AbstractWartechnic(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                              final double fireRange, final int armorType) {
        this.engineVolume = engineVolume;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.passengersCapacity = passengersCapacity;
        this.fireRange = fireRange;
        this.armorType = armorType;
    }

    public AbstractWartechnic() {
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(final int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(final double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(final int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public double getFireRange() {
        return fireRange;
    }

    public void setFireRange(final double fireRange) {
        this.fireRange = fireRange;
    }

    public int getArmorType() {
        return armorType;
    }

    public void setArmorType(final int armorType) {
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
