package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Tank extends AbstractWartechnic {

    int overviewInDegrees;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "warehouse_id")
    @JsonIgnoreProperties("tanks")
    private Warehouse warehouse;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Tanks_Ammo",
            joinColumns = {@JoinColumn(name = "tank_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "ammo_id", nullable = true)})
    @JsonIgnoreProperties("flowers")
    private Set<Ammo> ammo;

    public Tank(final int engineVolume, final double fuelConsumption, final int maxSpeed, final int passengersCapacity,
                final double fireRange, final int armorType, final int overviewInDegrees) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, armorType);
        this.overviewInDegrees = overviewInDegrees;
    }

    public Tank(){
    }

    public int getOverviewInDegrees() {
        return overviewInDegrees;
    }

    public void setOverviewInDegrees(final int overviewInDegrees) {
        this.overviewInDegrees = overviewInDegrees;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + "patency" + "," + "overviewInDegrees";
    }

    public final String toCSV() {
        return super.toCSV() + "," + getOverviewInDegrees();
    }

}
