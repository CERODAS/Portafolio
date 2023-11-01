import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RubberDuckTest {

    private  Duck d;
    private ByteArrayOutputStream out;
    @Before
    public void setUp() throws Exception {
        d = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void display() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un patito de hule"));
    }

    @Test
    public void testToString() {
        String esperado = "rubberduck{flybehavior=flynoway{}, soundbehavior=squeak{}}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}