package arrays

/**
 * pair with the maxumum product
 */

fun maximumProductPair(array: Array<Int>): Int {
    //find maximum and second maximum element
    var max = array[0]
    var secondMax = Int.MIN_VALUE

    (1..array.size-1).forEach {
        if (array[it] > max) {
            secondMax = max
            max = array[it]
        } else if (array[it] > secondMax) {
            secondMax = array[it]
        }
    }

    //find minimum and second minimum element
    var min = array[0]
    var secondMin = Int.MAX_VALUE
    (1..array.size-1).forEach {
        if (array[it] < min) {
            secondMin = min
            min = array[it]
        } else if (array[it] < secondMin){
            secondMin = array[it]
        }
    }

    return Math.max(max*secondMax, min*secondMin)
}

fun main(args: Array<String>) {
    var array = arrayOf(-10,-8, 7, 4, 9, 0)
    println(maximumProductPair(array))
}
