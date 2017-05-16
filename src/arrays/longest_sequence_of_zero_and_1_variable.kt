package arrays

/**
 * find the maximum sequence of continuos 1's that can be formed by replacing at most k zeros by ones
 */

fun maxReplace(array: Array<Int>, k: Int) {
    var left = 0
    var count  = 0
    var window  = 0
    var leftIndex = left
    var right  = -1

    array.forEach {
        right++
        if (it == 0) {
            count++
        }

        while (count > k) {
            if (array[left] == 0) {
                count--
            }

            left++
        }

        if (right - left + 1 > window) {
            window = right - left + 1
            leftIndex = left
        }
    }

    println("left $leftIndex")
    println(window)
}

fun main(args: Array<String>) {
    var array = arrayOf(1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0)
    maxReplace(array, 1)
}