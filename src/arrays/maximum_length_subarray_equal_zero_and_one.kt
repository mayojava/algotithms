package arrays

/**
 * find maximum length sub array with equal number of zero and one
 */
fun maxLengthSubArrayWithEqualZeroAndOnes(array: Array<Int>): Int {
    var sum = 0
    var len = 0
    var map = mutableMapOf<Int, Int>()
    map.put(0, -1)

    var endIndex = -1

    for (i in array.indices) {
        sum += if (array[i] == 0) -1 else 1

        if (!map.containsKey(sum)) {
            map.put(sum, i)
        }

        if (map.containsKey(sum - 0) && len < i - map.get(sum - 0)!!) {
            len = i - map.get(sum - 0)!!
            endIndex = i
        }
    }

    return len
}
