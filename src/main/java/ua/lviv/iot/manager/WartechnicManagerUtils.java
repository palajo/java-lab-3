package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Tank;

import java.util.Comparator;
import java.util.List;

public class WartechnicManagerUtils {

    public static void sortTanksByPassengersCapacity(List<Tank> tanks, SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getPassengersCapacity);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }

    public static void sortTanksByArmorType(List<Tank> tanks, SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getArmorType);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }

    public static void sortTanksByMaxSpeed(List<Tank> tanks, SortType sortType) {


        // anonymous inner class
        Comparator<Tank> comparator = new Comparator<Tank>() {

            @Override
            public int compare(Tank firstVehicle, Tank secondVehicle) {

                int capacityComparisonResult = firstVehicle.getMaxSpeed() - secondVehicle.getMaxSpeed();

                if (capacityComparisonResult != 0) {
                    return capacityComparisonResult;
                }

                return 0;

            }
        };

        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }
}