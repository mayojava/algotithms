package arrays

/**
 * finds which index containing a zero in an array of zero and one, to change to 1 and have the longest sequence of
 * 0 and 1
 */

fun findIndex(array: Array<Int>): Int {
    (1..array.size-1)
            .filter { array[it] == 1 }
            .forEach { array[it] = array[it] + array[it -1] }

    var count = 0
    for (i in array.size-1 downTo 0) {
        if (array[i] != 0) {
            count = Math.max(count, array[i])
            array[i] = count
        } else {
            count = 0
        }
    }

    array.forEach { print("$it ") }
    println()

    var index = 0
    var maxSum = 0

    for (i in array.indices) {
        if (array[i] != 0) continue

         if (i == 0) {
             if (maxSum < array[i+1]) {
                 maxSum = array[i+1]
                 index = i
             }
         } else if (i == array.size - 1) {
             if (maxSum < array[i - 1]) {
                 maxSum = array[i - 1]
                 index = i
             }
         } else {
             var sum = array[i-1] + array[i+1]
             if (maxSum < sum) {
                 maxSum = sum
                 index = i
             }
         }
    }

    return index
}

fun main(args: Array<String>) {
    var array = arrayOf(1,1,1,1,1,1,0)
    val index = findIndex(array)
    println(index)
}
