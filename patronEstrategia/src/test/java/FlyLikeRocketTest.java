import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlyLikeRocketTest {

    private IFly iFly;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        iFly = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        iFly.fly();
        assertTrue(out.toString().toLowerCase().contains("volar como coete"));
    }

    @Test
    public void testToString() {
        String esperado="flylikerocket{}";
        String ontenido= iFly.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }
}