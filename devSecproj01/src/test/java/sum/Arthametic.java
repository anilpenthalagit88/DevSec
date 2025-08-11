package sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Arthametic {

    @Test
    void testSumOfPositiveDoubles() {
        Double x = 1000.0;
        Double y = 2000.0;
        double expected = 3000.0;
        assertEquals(expected, x + y, 1e-9,
            "Sum of 1000.0 and 2000.0 should equal 3000.0");
    }

    @Test
    void testSumWithZero() {
        double x = 0.0;
        double y = 2000.0;
        assertEquals(2000.0, x + y, 1e-9,
            "Adding zero should return the other operand unchanged");
    }

    @Test
    void testSumWithNegative() {
        double x = -500.0;
        double y = 1500.0;
        assertEquals(1000.0, x + y, 1e-9,
            "Negative plus positive should work correctly");
    }

    @Test
    void testSumLargeAndSmallNumbers() {
        double x = 1e18;
        double y = 1.0;
        assertEquals(1e18 + 1.0, x + y, 1e6,
            "When numbers differ greatly in magnitude, allow a larger epsilon");
    }

    @Test
    void testWithFloatingPointPrecision() {
        double x = 0.1 * 8; // yields 0.8
        double y = 0.8 - 1e-16;
        assertEquals(x + y, 1.6 - 1e-16, 1e-12,
            "Handle typical floating‑point round‑off gracefully");
    }
}
