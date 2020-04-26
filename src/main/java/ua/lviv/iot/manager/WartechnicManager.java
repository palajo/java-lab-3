package ua.lviv.iot.manager;

import ua.lviv.iot.model.Tank;

import java.util.ArrayList;
import java.util.List;

public class WartechnicManager {

    private List<Tank> technicInGarage = new ArrayList<>();

    public void removeTankFromGarage(Tank... tankToRemove) {
        for (Tank tank : tankToRemove) {
            this.technicInGarage.remove(tank);
        }
    }

    public void addTanksToGarage(List<Tank> tanksToAdd) {
        this.technicInGarage.addAll(tanksToAdd);
    }

    public List<Tank> findTechnicByFuelConsumption(double fuelConsumptionToCompare) {
        ArrayList<Tank> result = new ArrayList<Tank>();
        for (Tank tank : this.technicInGarage) {
            if (tank.getFuelConsumption() < fuelConsumptionToCompare) {
                result.add(tank);
            }
        }
        return result;
    }

}
