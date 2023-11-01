import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedheadDuckTest {

    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new RedheadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void display() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato cabeza roja"));
    }

    @Test
    public void testToString() {
        String esperado = "redheadduck{flybehavior=flywithwings{}, soundbehavior=quack{}}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}