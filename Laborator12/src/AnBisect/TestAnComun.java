package AnBisect;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnComun {

    @Test
    public void testAnComun() {
        assertFalse(!AnBisect.esteAnBisect(4));
    }
}
