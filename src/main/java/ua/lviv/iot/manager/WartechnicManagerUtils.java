package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Tank;

import java.util.Comparator;
import java.util.List;

public class WartechnicManagerUtils {

    //anonymous class with comparator
    private static Comparator<Tank> compareByPatency = new Comparator<>() {

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getPatency().compareTo(secondTank.getPatency());
        }

    };

    // method for - anonymous class with comparator
    public static void sortByPatency(final List<Tank> tanks, final SortType sortType) {

        tanks.sort(sortType == SortType.ASCENDING ? compareByPatency : compareByPatency.reversed());

    }

    // static inner class with comparator
    private static class TanksByMaxSpeedSorter implements Comparator<Tank> {
        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getMaxSpeed() - secondTank.getMaxSpeed();
        }
    }

    // method for - static class with comparator
    public static void sortByMaxSpeed(final List<Tank> tanks, final SortType sortType) {

        if (sortType == SortType.ASCENDING) {
            tanks.sort(new TanksByMaxSpeedSorter());
        }
        if (sortType == SortType.DESCENDING) {
            tanks.sort(new TanksByMaxSpeedSorter().reversed());
        }

    }

    //inner class with comparator
    private class TanksByOverviewInDegreesSorter implements Comparator<Tank> {
        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getOverviewInDegrees() - secondTank.getOverviewInDegrees();
        }
    }

    // method for - inner class with comparator
    public final void sortByOverviewInDegrees(final List<Tank> tanks, final SortType sortType) {

        if (sortType == SortType.ASCENDING) {
            tanks.sort(new TanksByOverviewInDegreesSorter());
        }
        if (sortType == SortType.DESCENDING) {
            tanks.sort(new TanksByOverviewInDegreesSorter().reversed());
        }

    }

    // realizing sorting from lab3
    public static void sortTanksByPassengersCapacity(final List<Tank> tanks, final SortType sortType) {
        Comparator<Tank> comparator = Comparator.comparing(Tank::getPassengersCapacity);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    public static void sortTanksByArmorType(final List<Tank> tanks, final SortType sortType) {
        Comparator<Tank> comparator = Comparator.comparing(Tank::getArmorType);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

}
