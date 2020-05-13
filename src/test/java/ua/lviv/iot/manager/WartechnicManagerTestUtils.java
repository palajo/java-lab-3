package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WartechnicManagerTestUtils extends BaseWartechnicManagerTest {

    @Test
    public void testSortingTanksByPassengersCapacity() {
        WartechnicManagerUtils.sortTanksByPassengersCapacity(tanks, SortType.ASCENDING);

        Assertions.assertEquals(4, tanks.get(0).getPassengersCapacity());
        Assertions.assertEquals(6, tanks.get(1).getPassengersCapacity());
        Assertions.assertEquals(8, tanks.get(2).getPassengersCapacity());

    }

    @Test
    public void testSortingTanksByArmorType() {
        WartechnicManagerUtils.sortTanksByArmorType(tanks, SortType.ASCENDING);

        Assertions.assertEquals(1, tanks.get(0).getArmorType());
        Assertions.assertEquals(2, tanks.get(1).getArmorType());
        Assertions.assertEquals(3, tanks.get(2).getArmorType());

    }

}
