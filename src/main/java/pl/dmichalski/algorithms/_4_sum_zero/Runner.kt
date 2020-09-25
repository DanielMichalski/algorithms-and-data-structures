package pl.dmichalski.algorithms._4_sum_zero

import java.util.*

/**
 * Write a function called sumZero which accepts a sorted
 * array of integers. The function should find the first
 * pair where sum is 0. Return an array that includes both
 * values that sum to zero or null if a pair does not exist.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val values = intArrayOf(-4, -3, -2, -1, 0, 1, 2, 3, 10)

        val sumToZeroService1 = SumToZeroService1()
        val sumToZeroService2 = SumToZeroService2()

        val result1 = sumToZeroService1.sumZero(values)
        val result2 = sumToZeroService2.sumZero(values)

        println("result1 = " + Arrays.toString(result1))
        println("result2 = " + Arrays.toString(result2))
    }
}