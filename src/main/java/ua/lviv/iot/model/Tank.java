package ua.lviv.iot.model;

import javax.persistence.Entity;

@Entity
public class Tank extends AbstractWartechnic {

    int overviewInDegrees;

    public Tank(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                final double fireRange, final int armorType, final int overviewInDegrees) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, armorType);
        this.overviewInDegrees = overviewInDegrees;
    }

    public Tank(){
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
