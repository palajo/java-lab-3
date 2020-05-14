package ua.lviv.iot.model;

public class Tank extends AbstractWartechnic {

    Levels patency;

    int overviewInDegrees;

    public Tank(int engineVolume, double fuelConsumption, int maxSpeed, int passengersCapacity, double fireRange, Levels damage, int armorType, Levels patency, int overviewInDegrees) {
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

    public final int getOverviewInDegrees() {
        return overviewInDegrees;
    }

    public final void setOverviewInDegrees(final int overviewInDegrees) {
        this.overviewInDegrees = overviewInDegrees;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + "patency" + "," + "overviewInDegrees";
    }

    public final String toCSV() {
        return super.toCSV() + "," + getOverviewInDegrees();
    }

}