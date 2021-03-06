package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Dec-16.
 */

public enum FindCommonMultipleOrDivisor {
    INSTANCE;

    /* Running time: O(log(a+b))
    *  Be careful 'a%b' follows the sign of 'a'
    *  7 % 2 = 1
    *  -7 % 2 = -1 (Note: Google calculator will return 1 but JVM returns -1 .)
    * */
    public int findGreatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return findGreatestCommonDivisor(b, a % b);
    }

    public int findLeastCommonMultiple(int a, int b) {
        return b * a / findGreatestCommonDivisor(a, b);
    }
}
