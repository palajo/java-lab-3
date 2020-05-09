package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Levels;
import ua.lviv.iot.model.SortType;

public class Tests extends BaseWartechnicManagerTest {


    // static inner class
    @Test
    public void testSortingTanksByMaxSpeed() {
        tanks.sort(new WartechnicManagerUtils.sortTanksByMaxSpeed());

        Assertions.assertEquals(100, tanks.get(0).getMaxSpeed());
        Assertions.assertEquals(130, tanks.get(1).getMaxSpeed());
        Assertions.assertEquals(160, tanks.get(2).getMaxSpeed());
    }


    // anonymous inner class
    @Test
    public void testSortingTanksByPatency(){
        WartechnicManagerUtils.sortTanksByPatency(tanks, SortType.ASCENDING);

        Assertions.assertEquals(Levels.LOW, tanks.get(0).getPatency());
        Assertions.assertEquals(Levels.MIDDLE, tanks.get(1).getPatency());
        Assertions.assertEquals(Levels.HIGH, tanks.get(2).getPatency());
    }
}
