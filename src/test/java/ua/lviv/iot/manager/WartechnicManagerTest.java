package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Tank;

import java.util.List;


public class WartechnicManagerTest extends BaseWartechnicManagerTest {

    private WartechnicManager wartechnicManager;

    @BeforeEach
    public void setUp(){
        wartechnicManager = new WartechnicManager();
        wartechnicManager.addTanksToGarage(tanks);
    }

    @Test
    public void testFindTechnicByFuelConsumption(){
        List<Tank> tanks = wartechnicManager.findTechnicByFuelConsumption(20);

        Assertions.assertEquals(1, tanks.size());
        Assertions.assertEquals(18.0, tanks.get(0).getFuelConsumption());
    }

}
