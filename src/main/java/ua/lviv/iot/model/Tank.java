package ua.lviv.iot.model;

public class Tank extends AbstractWartechnic {

    Levels patency;

    int overviewInDegrees;

    public Tank(double engineVolume, double fuelConsumption, double maxSpeed, int passengersCapacity, double fireRange, Levels damage, Types armorType, Levels patency, int overviewInDegrees) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.patency = patency;
        this.overviewInDegrees = overviewInDegrees;
    }

    public Tank(){
    }

    public Levels getPatency() {
        return patency;
    }

    public void setPatency(Levels patency) {
        this.patency = patency;
    }

    public int getOverviewInDegrees() {
        return overviewInDegrees;
    }

    public void setOverviewInDegrees(int overviewInDegrees) {
        this.overviewInDegrees = overviewInDegrees;
    }
}
