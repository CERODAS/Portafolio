import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoyDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void display() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato señuelo"));
    }

    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}