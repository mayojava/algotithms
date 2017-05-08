package arrays

/**
 * find the maximum sum subarray in a circular array
 */

fun doKadene(array: Array<Int>): Int {
    var sum  = array[0];
    var sumAtThisIndex = array[0]

    (1..array.size-1).forEach {
        sumAtThisIndex = sumAtThisIndex + array[it]
        sumAtThisIndex = Math.max(sumAtThisIndex, array[it])

        sum = Math.max(sum, sumAtThisIndex)
    }

    return sum
}

fun circularSubArraySum(array: Array<Int>): Int{
    val sumNoWrap = doKadene(array)
    var elemTotal = 0

    (0..array.size-1).forEach {
        elemTotal += array[it]
        array[it] = -array[it]
    }

    val sumWrap = elemTotal - -1 * doKadene(array)

    return Math.max(sumNoWrap, sumWrap)
}

fun main(args: Array<String>) {
    var array = arrayOf(2, 1, -5, 4, -3, 1, -3, 4, -1 )
    var res = circularSubArraySum(array)
    println(res)
}