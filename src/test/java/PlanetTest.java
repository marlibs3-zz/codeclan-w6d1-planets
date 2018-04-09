import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    private Planet mars;

    @Before
    public void  before() {
        mars = new Planet("Mars", 908973);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", mars.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(908973, mars.getSize());
    }

    @Test
    public void hasExploded(){
        assertEquals("Boom! Mars has exploded.", mars.explode());
    }
}
