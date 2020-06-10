package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int tanksCapacity;

    private int areaInSquareMeters;

    @OneToMany(mappedBy = "warehouse", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("warehouse")
    private Set<Tank> tanks;

    public Warehouse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTanksCapacity() {
        return tanksCapacity;
    }

    public void setTanksCapacity(int tanksCapacity) {
        this.tanksCapacity = tanksCapacity;
    }

    public int getAreaInSquareMeters() {
        return areaInSquareMeters;
    }

    public void setAreaInSquareMeters(int areaInSquareMeters) {
        this.areaInSquareMeters = areaInSquareMeters;
    }

    public Set<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(Set<Tank> tanks) {
        this.tanks = tanks;
    }
}
