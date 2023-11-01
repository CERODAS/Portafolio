import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DuckTest {

    private Duck d;

    public DuckTest() {
    }

    @Test
    public  void testToString(){
        String esperado = "duck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
