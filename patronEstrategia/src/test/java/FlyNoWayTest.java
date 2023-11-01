import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlyNoWayTest {
    private  IFly iFly;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        iFly = new FlyNoWay();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testToString() {
        String esperado="flynoway{}";
        String ontenido= iFly.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }
    @Test
    public void fly() {
        iFly.fly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }
}
