package AnBisect;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TestAnBisect {

    AnBisect an = new AnBisect(5);

    @Test
    public void testAnBisectCu4() {
        assertTrue(AnBisect.esteAnBisect(4));
    }

    @Test
    public void testAnBisectCu400() {
        assertTrue(AnBisect.esteAnBisect(400));
    }

    @Test
    public void testAnBisectCu99() {
        assertFalse(AnBisect.esteAnBisect(99));
    }
}
