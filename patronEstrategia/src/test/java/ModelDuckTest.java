import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    public ModelDuckTest() {
    }

    @Before
    public void setUp() throws Exception {
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testPerformFly(){
        d.performFly();

        d.setFlyBehavior(new FlyLikeRocket());
        d.performFly();

        assertTrue(out.toString().toLowerCase().contains("volar como coete"));
    }
    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato"));
    }
    @Test
    public void testPerformSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }

    @Test
    public void testToString() {
    }
}