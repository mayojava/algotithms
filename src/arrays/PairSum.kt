package arrays

/**
 * searches an array for pair with a particular sum
 */

fun main(args: Array<String>) {
    val array = arrayOf(8, 7, 2, 5, 3, 1)
    val sum = 10

    doPairSum(array, sum)
}

fun doPairSum(array: Array<Int>, sum: Int) {
    val map = mutableMapOf<Int, Int>()

    for (index in array.indices) {
        if (map.containsKey(sum - array[index])) {
            println("%d %d".format(array[index], array[map.get(sum - array[index])!!]))
            break;
        }

        map.put(array[index], index)
    }
}
