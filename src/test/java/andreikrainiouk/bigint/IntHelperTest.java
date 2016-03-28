package andreikrainiouk.bigint;

import org.junit.Test;
import static org.junit.Assert.*;
import static andreikrainiouk.bigint.IntHelper.*;

/**
 * Created by Andrei on 3/27/2016.
 */

public class IntHelperTest {
    @Test
    public void testIntPow() {
        assertEquals(1, intPow(10, 0));

        assert intPow(10, 0) == 1;
        assert intPow(10, 1) == 10;
        assert intPow(10, 2) == 100;
        assert intPow(0, 1) == 0;
        assert intPow(0, 0) == 1;
        assert intPow(-1, 0) == 1;
        assert intPow(-1, 1) == -1;
        assert intPow(-1, 2) == 1;
        assert intPow(-1, 3) == -1;
        assert intPow(-3, 2) == 9;
    }

    @Test
    public void testNumDigits() {
        assert numDigits(0) == 0;
        assert numDigits(1) == 1;
        assert numDigits(21) == 2;
        assert numDigits(333) == 3;
        assert numDigits(4141) == 4;
    }

    @Test
    public void testGetDigitAt() {
        assert getDigitAt(543210, 0) == 0;
        assert getDigitAt(543210, 1) == 1;
        assert getDigitAt(543210, 2) == 2;
        assert getDigitAt(543210, 3) == 3;
        assert getDigitAt(543210, 4) == 4;
        assert getDigitAt(543210, 5) == 5;
    }
}