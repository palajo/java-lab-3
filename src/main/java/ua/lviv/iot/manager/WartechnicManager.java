package ua.lviv.iot.manager;

import ua.lviv.iot.model.Tank;

import java.util.ArrayList;
import java.util.List;

public class WartechnicManager {

    private List<Tank> tanks = new ArrayList<>();

    public final void addTanksToGarage(final List<Tank> tanksToAdd) {
        this.tanks.addAll(tanksToAdd);
    }

    public final List<Tank> findTechnicByFuelConsumption(final double fuelConsumptionToCompare) {

        ArrayList<Tank> result = new ArrayList<>();

        for (Tank tank : this.tanks) {
            if (tank.getFuelConsumption() < fuelConsumptionToCompare) {
                result.add(tank);
            }
        }

        return result;
    }

    public final void displayTanksInfo() {
        for (Tank tank : this.tanks) {
            System.out.println(tank);
        }
    }

}
