package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Levels;
import ua.lviv.iot.model.SortType;

public class Tests extends BaseWartechnicManagerTest {

    @Test
    public void testSortingAnonymousClass() {
        WartechnicManagerUtils.sortByPatency(tanks, SortType.ASCENDING);

        Assertions.assertEquals(Levels.LOW, tanks.get(0).getPatency());
        Assertions.assertEquals(Levels.MIDDLE, tanks.get(1).getPatency());
        Assertions.assertEquals(Levels.HIGH, tanks.get(2).getPatency());
    }

    @Test
    public void testSortingStaticInnerClass() {
        WartechnicManagerUtils.sortByMaxSpeed(tanks, SortType.ASCENDING);

        Assertions.assertEquals(100, tanks.get(0).getMaxSpeed());
        Assertions.assertEquals(130, tanks.get(1).getMaxSpeed());
        Assertions.assertEquals(160, tanks.get(2).getMaxSpeed());
    }

    @Test
    public void testSortingInnerClass() {
        WartechnicManagerUtils wartechnicManagerUtils = new WartechnicManagerUtils();
        wartechnicManagerUtils.sortByOverviewInDegrees(tanks, SortType.ASCENDING);

        Assertions.assertEquals(180, tanks.get(0).getOverviewInDegrees());
        Assertions.assertEquals(270, tanks.get(1).getOverviewInDegrees());
        Assertions.assertEquals(360, tanks.get(2).getOverviewInDegrees());
    }

}
