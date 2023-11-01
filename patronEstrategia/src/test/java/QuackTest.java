import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuackTest {
    private ISound iquack;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        iquack = new Quack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMakeSound() {
        iquack.makeSound();
        assertTrue(out.toString().toLowerCase().contains("estoy haciendo quack"));
    }

    @Test
    public void testToString() {
        String esperado="quack{}";
        String ontenido= iquack.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }
}
