package ua.lviv.iot.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.model.Levels;
import ua.lviv.iot.model.Tank;

import java.util.ArrayList;

public abstract class BaseWartechnicManagerTest {

    protected ArrayList<Tank> tanks;

    @BeforeEach
    public void addTanksToGarage() {
        tanks = new ArrayList<Tank>();

        tanks.add(new Tank( 6, 32.0, 160, 8,2, 1, 360 ));
        tanks.add(new Tank( 6, 32.0, 160, 8,2, 1, 360 ));
        tanks.add(new Tank( 6, 32.0, 160, 8,2, 1, 360 ));
    }

}
