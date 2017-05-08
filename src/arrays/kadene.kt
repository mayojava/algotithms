package arrays

/**
 * kadene algorithm for sub array with maximum sum
 */

fun kadene(array: Array<Int>): Int {
    var maxSumSoFar = array[0]
    var maxSumThatEndsAtThisIndex = array[0]

    (1..array.size-1).forEach {
        maxSumThatEndsAtThisIndex = maxSumThatEndsAtThisIndex + array[it]

        maxSumThatEndsAtThisIndex = Math.max(maxSumThatEndsAtThisIndex, array[it])

        maxSumSoFar = Math.max(maxSumSoFar, maxSumThatEndsAtThisIndex)
    }

    return maxSumSoFar
}

fun main(args: Array<String>) {
    val array = arrayOf(-2, -1, 5, -4, 3, -1, 3, -4, 1)
    println(kadene(array))
}
