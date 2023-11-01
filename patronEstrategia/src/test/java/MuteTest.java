import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MuteTest {
    private ISound mute;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        mute = new Mute();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMakeSound() {
        mute.makeSound();
        assertTrue(out.toString().toLowerCase().contains("no puedo grasnar"));
    }

    @Test
    public void testToString() {
        String esperado="mute{}";
        String ontenido= mute.toString().toLowerCase();
        assertEquals(esperado,ontenido);
    }
}
