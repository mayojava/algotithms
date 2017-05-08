package arrays

/**
 * finds longest bitonic(increasing then decreasing sequence in an array)
 */

fun bitonic(array: Array<Int>): IntArray {
    var maxLen  = 0
    var endIndex = -1

    var i = 0

    while (i+1 < array.size) {
        var len = 1

        while (i+1 < array.size && array[i] < array[i+1]) {
            len++
            i++
        }

        while (i+1 < array.size && array[i] > array[i+1]) {
            len++
            i++
        }

        if (len > maxLen) {
            maxLen = len
            endIndex = i
        }
    }

    val res = IntArray(2)
    res[0] = maxLen
    res[1] = endIndex

    return res
}

fun main(args: Array<String>) {
    var array = arrayOf(3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4)
    val res = bitonic(array)
    println("max len: ${res[0]}")
    println("start index: ${res[1] - res[0] + 1} end index: ${res[1]}")

}
