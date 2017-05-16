package arrays

/**
 * find all equilibrum positions in array where sum to the left == sum to the right
 */
fun equilibrum(array: Array<Int>) {
    var total = 0
    (0..array.size-1).forEach { total += array[it] }

    var sumSoFar = 0
    (array.size-1 downTo 0).forEach {
        sumSoFar += array[it]
        var sumToRight = if (it == array.size-1) 0 else sumSoFar - array[it]
        var sumToLeft = total - sumSoFar

        if (sumToLeft == sumToRight) {
            println(it)
        }
    }
}

fun main(args: Array<String>) {
    equilibrum(arrayOf(0, -3, 5, -4, -2, 3, 1, 0))
}