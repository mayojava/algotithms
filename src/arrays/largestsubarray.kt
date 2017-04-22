package arrays

/**
 * finds the latgest subarray formed by consecutive integers
 */

fun findLargestSubArray(array: Array<Int>) {
    var len = 1
    var startIndex = 0
    var endIndex = 0

    for (i in 0..array.size-2) {
        var minElement = array[i]
        var maxElement = array[i]

        for (j in i+1..array.size-1) {
            minElement = Math.min(minElement, array[j])
            maxElement = Math.max(maxElement, array[j])

            if (isConsecutive(array, i, j)) {
                if (len < maxElement - minElement + 1) {
                    len = maxElement - minElement + 1
                    startIndex = i
                    endIndex = j
                }
            }

        }
    }

}

fun isConsecutive(array: Array<Int>, i: Int, j: Int): Boolean {
    return true
}

fun main(args: Array<String>) {

}
