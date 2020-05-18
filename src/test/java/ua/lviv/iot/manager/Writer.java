package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.IOMmanager.TankWriter;
import ua.lviv.iot.model.Levels;
import ua.lviv.iot.model.Tank;

import java.io.IOException;
import java.io.StringWriter;

public class Writer {

    @Test
    public void inputManager() throws IOException {
        Tank supertank = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );
        Tank supertank1 = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );
        Tank supertank2 = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );

        TankWriter.inputStaticTextToFile("text.csv", supertank.getHeaders(),
                supertank.toCSV(), supertank1.toCSV(), supertank2.toCSV());
    }
    @Test
    public void outputManager() throws IOException {
        TankWriter.outputStaticTextOfFile("text.csv");
    }
    @Test
    public void inputAndOutputTest() throws IOException {
        Tank supertank = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );
        Tank supertank1 = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );
        Tank supertank2 = new Tank( 6, 32.0, 160, 8,2,
                Levels.HIGH, 1, Levels.HIGH, 360 );

        TankWriter.inputStaticTextToFile("text.csv", supertank.getHeaders(),
                supertank.toCSV(), supertank1.toCSV(), supertank2.toCSV());
        TankWriter.outputStaticTextOfFile("text.csv");
    }
    @Test
    public void stringWriterTest() throws IOException {
        try {
            Tank supertank = new Tank( 6, 32.0, 160, 8,2,
                    Levels.HIGH, 1, Levels.HIGH, 360 );

            TankWriter tankStringWriter = new TankWriter(new StringWriter());
            tankStringWriter.inputText(supertank.toCSV());
            String expectedExpression = supertank.toCSV() + "\r\n";
            Assertions.assertEquals(expectedExpression, tankStringWriter.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
