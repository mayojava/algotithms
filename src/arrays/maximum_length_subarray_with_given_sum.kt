package arrays

/**
 * finds the maximum length sub array with a given sum
 */

fun maxLengthArrayWithGivenSum(array: Array<Int>, s: Int): Int {
    var len = 0
    val map = mutableMapOf<Int, Int>()
    var sum  = 0

    map.put(0, -1) // initialize map for case when sum was found starting from index zero
    var endIndex = -1

    for (i in array.indices) {
        sum += array[i]

        if (!map.containsKey(sum)) {
            map.put(sum, i)
        }

        if (map.containsKey(sum - s) && len < i - map.get(sum - s)!!) {
            len = i - map.get(sum - s)!!
            endIndex = i
        }
    }

    return len
}
