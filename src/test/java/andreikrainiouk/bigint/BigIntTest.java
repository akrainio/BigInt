package andreikrainiouk.bigint;

import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testNegCopy() {
        BigInt num1 = new BigInt(-13);
        BigInt num2 = num1.negCopy();
        num1.printBigInt();
        System.out.println("multiplied by -1 is:");
        num2.printBigInt();
        System.out.println();
        num1 = new BigInt(13);
        num2 = num1.negCopy();
        num1.printBigInt();
        System.out.println("multiplied by -1 is:");
        num2.printBigInt();
    }

    @Test
    public void testCompareBigInt() {
        BigInt num1 = new BigInt(0);
        BigInt num2 = new BigInt(0);
        assertEquals(0, num1.compareBigInt(num2));
        num1 = new BigInt(1);
        num2 = new BigInt(0);
        assertEquals(1, num1.compareBigInt(num2));
        num1 = new BigInt(0);
        num2 = new BigInt(1);
        assertEquals(-1, num1.compareBigInt(num2));
        num1 = new BigInt(10);
        num2 = new BigInt(1);
        assertEquals(1, num1.compareBigInt(num2));
        num1 = new BigInt(1);
        num2 = new BigInt(10);
        assertEquals(-1, num1.compareBigInt(num2));
        num1 = new BigInt(-1);
        num2 = new BigInt(0);
        assertEquals(-1, num1.compareBigInt(num2));
        num1 = new BigInt(-1);
        num2 = new BigInt(-1);
        assertEquals(0, num1.compareBigInt(num2));
        num1 = new BigInt(-1);
        num2 = new BigInt(-10);
        assertEquals(1, num1.compareBigInt(num2));
        num1 = new BigInt(-10);
        num2 = new BigInt(-1);
        assertEquals(-1, num1.compareBigInt(num2));
        num1 = new BigInt(-10);
        num2 = new BigInt(10);
        assertEquals(-1, num1.compareBigInt(num2));
        num1 = new BigInt(10);
        num2 = new BigInt(-10);
        assertEquals(1, num1.compareBigInt(num2));
    }
}