package ua.lviv.iot.model;

public class Tank extends AbstractWartechnic {

    Levels patency;

    int overviewInDegrees;

    public Tank(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                final double fireRange, final Levels damage, final int armorType, final Levels patency,
                final int overviewInDegrees) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.patency = patency;
        this.overviewInDegrees = overviewInDegrees;
    }

    public Tank(){
    }

    public final Levels getPatency() {
        return patency;
    }

    public final void setPatency(final Levels patency) {
        this.patency = patency;
    }

    public final int getOverviewInDegrees() {
        return overviewInDegrees;
    }

    public final void setOverviewInDegrees(final int overviewInDegrees) {
        this.overviewInDegrees = overviewInDegrees;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " patency" + "," + " overviewInDegrees";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " patency = " + getPatency() + "," + " overviewInDegrees" + getOverviewInDegrees();
    }

}
