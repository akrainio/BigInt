package andreikrainiouk.bigint;

import andreikrainiouk.bigint.BigInt;

import org.junit.Test;

/**
 * Created by Andrei on 3/27/2016.
 */
public class BigIntTest {
    @Test
    public void testPrintBigInt() {
        System.out.println("Should print out '1234'");
        BigInt num1 = new BigInt(1234);
        num1.printBigInt();
        System.out.println("Should print out '-1234'");
        BigInt num2 = new BigInt(-1234);
        num2.printBigInt();
    }

    /*@Test
    public void testCompareBigInt() {
        BigInt num1 = new BigInt(0);
        BigInt num2 = new BigInt(0);
        assert num1.compareBigInt(num2) == 0;
    }*/
}