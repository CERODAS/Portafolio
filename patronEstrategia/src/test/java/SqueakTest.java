import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SqueakTest {
    private ISound isqueak;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        isqueak = new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMakeSound() {
        isqueak.makeSound();
        assertTrue(out.toString().toLowerCase().contains("squeck"));
    }

    @Test
    public void testToString() {
        String esperado="squeak{}";
        String ontenido= isqueak.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }

}
