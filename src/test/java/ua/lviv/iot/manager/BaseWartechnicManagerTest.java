package ua.lviv.iot.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.model.Levels;
import ua.lviv.iot.model.Tank;
import ua.lviv.iot.model.Types;

import java.util.ArrayList;

public abstract class BaseWartechnicManagerTest {

    protected ArrayList<Tank> tanksInGarage;

    @BeforeEach
    public void addTanksToGarage() {
        tanksInGarage = new ArrayList<Tank>();

        tanksInGarage.add(new Tank( 6.3, 32.0, 420.0, 8,2, Levels.HIGH, Types.HEAVYWEIGHT, Levels.LOW, 360 ));
        tanksInGarage.add(new Tank( 5.5, 36.6, 240.0, 6,1.5, Levels.HIGH, Types.HEAVYWEIGHT, Levels.LOW, 270 ));
        tanksInGarage.add(new Tank( 4.0, 18.0, 160.0, 4,1, Levels.HIGH, Types.HEAVYWEIGHT, Levels.LOW, 180 ));
    }


}
