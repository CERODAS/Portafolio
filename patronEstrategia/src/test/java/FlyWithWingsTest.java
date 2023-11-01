import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {
    private  IFly iFly;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        iFly = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testToString() {
        String esperado="flywitwings{}";
        String ontenido= iFly.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }
    @Test
    public void fly() {
        iFly.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }
}