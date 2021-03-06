package com.danielmichalski.algorithms.algorithms._01_sum_from_1_to_n

internal class SumCounterService2 {

    /**
     * O(1) time complexity
     */
    fun countSumFrom1ToN(n: Int): Int {
        return n * (n + 1) / 2
    }
}
