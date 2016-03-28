package andreikrainiouk.bigint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 3/24/2016.
 */

public class BigInt {

    //ArrayList representation of a natural number
    private final List<Integer> value;
    //Denotes sign
    private final boolean positive;

    //Constructor function
    public BigInt(int value) {
        if (value < 0) {
            positive = false;
            this.value = toList(value * -1);
        } else {
            positive = true;
            this.value = toList(value);
        }
    }

    //Helper for constructor, converts positive integer into ArrayList
    private List<Integer> toList(int value) {
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < IntHelper.numDigits(value); i++) {
            newList.add(IntHelper.getDigitAt(value, i));
        }
        return newList;
    }

    //Prints out BigInt
    public void printBigInt() {
        if (!positive) System.out.print("-");
        for (int i = value.size(); i > 0; i--) {
            System.out.print(value.get(i - 1));
        }
        System.out.println();
    }

    //Compares 2 BigInts, returns -1 for num1 < num2, 0 for num1 = num2, and 1 for num1 > num2
    public int compareBigInt(BigInt num2) {
        return 1;
    }

    //Externally called add function
    public BigInt add(BigInt that) {
        return that;
    }

    //Externally called subtraction function
    public BigInt subtract(BigInt that) {
        return that;
    }

    //Called by add and subtract, actual code that calculates sums
    private BigInt sum(BigInt that) {
        return that;
    }
}
