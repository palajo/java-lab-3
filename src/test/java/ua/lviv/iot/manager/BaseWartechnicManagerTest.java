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

        tanks.add(new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 ));
        tanks.add(new Tank( 5, 36.6, 130, 6,1.5,
                Levels.MIDDLE, 3, Levels.LOW, 270 ));
        tanks.add(new Tank( 4, 18.0, 100, 4,1,
                Levels.LOW, 2, Levels.MIDDLE, 180 ));
    }


}
