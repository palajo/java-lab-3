package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ammo {

    private double caliber;

    private String material;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Tanks_Ammo",
            joinColumns = {@JoinColumn(name = "ammo_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "tank_id", nullable = false)})
    private Set<Tank> tanks;

    public Ammo() {
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(Set<Tank> tanks) {
        this.tanks = tanks;
    }
}
