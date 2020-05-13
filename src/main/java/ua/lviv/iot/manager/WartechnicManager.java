package ua.lviv.iot.manager;

import ua.lviv.iot.model.Tank;

import java.util.ArrayList;
import java.util.List;

public class WartechnicManager {

    private List<Tank> tanks = new ArrayList<>();

    public void addTanksToGarage(List<Tank> tanksToAdd) {
        this.tanks.addAll(tanksToAdd);
    }

    public List<Tank> findTechnicByFuelConsumption(double fuelConsumptionToCompare) {

        ArrayList<Tank> result = new ArrayList<Tank>();

        for (Tank tank : this.tanks) {
            if (tank.getFuelConsumption() < fuelConsumptionToCompare) {
                result.add(tank);
            }
        }

        return result;
    }

}
