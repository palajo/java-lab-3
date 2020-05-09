package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Tank;

import java.util.Comparator;
import java.util.List;

public class WartechnicManagerUtils {


    private Comparator<Tank> compareByPatency = new Comparator<Tank>() {

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getPatency().compareTo(secondTank.getPatency());
        }

    };

    public static void sortTanksByPatency(final List<Tank> tanks, final SortType sortType) {

        Comparator<Tank> comparator = new Comparator<Tank>() {

            @Override
            public int compare(final Tank firstTank, final Tank secondTank) {

                return firstTank.getPatency().compareTo(secondTank.getPatency());

            }

        };

        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }

    public static void sortTanksByPassengersCapacity(final List<Tank> tanks, final SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getPassengersCapacity);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }

    public static void sortTanksByArmorType(final List<Tank> tanks,final SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getArmorType);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }

    public final Comparator<Tank> getCompareByPatency() {
        return compareByPatency;
    }

    public final void setCompareByPatency(final Comparator<Tank> compareByPatency) {
        /** asked for comment */
        this.compareByPatency = compareByPatency;
    }

    // static inner class sorting
    static class sortTanksByMaxSpeed implements Comparator<Tank> {

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getMaxSpeed() - secondTank.getMaxSpeed();
        }

    }


    // inner class sorting
    class sortTanksByOverviewInDegrees implements Comparator<Tank> {

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getOverviewInDegrees() - secondTank.getOverviewInDegrees();
        }

    }


}
