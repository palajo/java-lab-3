package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.SortType;

public class Tests extends BaseWartechnicManagerTest {

    @Test
    void staticInnerClassSortTest() {
    }

    @Test
    void innerClassSortTest() {
    }

    @Test
    public void testSortLambdaTest() {
        tanks.sort((o1, o2) -> o1.getEngineVolume() - o2.getEngineVolume());

        Assertions.assertEquals(4, tanks.get(0).getEngineVolume());
        Assertions.assertEquals(5, tanks.get(1).getEngineVolume());
        Assertions.assertEquals(6, tanks.get(2).getEngineVolume());
    }


    // inner class
    @Test
    public void testSortingTanksByMaxSpeed(){
        tanks.sort(new WartechnicManagerUtils.sortTanksByMaxSpeed());

        Assertions.assertEquals(100, tanks.get(0).getMaxSpeed());
        Assertions.assertEquals(130, tanks.get(1).getMaxSpeed());
        Assertions.assertEquals(160, tanks.get(2).getMaxSpeed());
    }


}
