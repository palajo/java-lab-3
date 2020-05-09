package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Tank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WartechnicManagerUtils {


    private Comparator<Tank> compareByPatency = new Comparator<Tank>() {

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getPatency().compareTo(secondTank.getPatency());
        }

    };


    public final Comparator<Tank> getCompareByPatency() {
        return compareByPatency;
    }


    public final void setCompareByPatency(final Comparator<Tank> compareByPatency) {
        this.compareByPatency = compareByPatency;
    }


    public static void sortTanksByPassengersCapacity(List<Tank> tanks, SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getPassengersCapacity);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }


    public static void sortTanksByArmorType(List<Tank> tanks, SortType sortType) {

        Comparator<Tank> comparator = Comparator.comparing(Tank::getArmorType);
        tanks.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

    }


    // static inner class sorting
    static class sortTanksByMaxSpeed implements Comparator<Tank>{

        @Override
        public int compare(final Tank firstTank, final Tank secondTank) {
            return firstTank.getMaxSpeed() - secondTank.getMaxSpeed();
        }

    }

    // lambda sorting
    public static void sortLambdaTest(final ArrayList<Tank> tanks) {
        tanks.sort((o1, o2) -> o1.getEngineVolume() - o2.getEngineVolume());
    }


}