package arrays

/**
 * sorts a binary array in linear time
 */

fun sortArray(array: Array<Int>) {
    var pivotIndex = 0
    val pivot = 1

    for (i in array.indices) {
        if (array[i] < pivot) {
            val temp = array[pivotIndex]
            array[pivotIndex] = array[i]
            array[i] = temp

            pivotIndex += 1
        }
    }
}

fun main(args: Array<String>) {
    val array = arrayOf(0,0,1,1,0,1,0,1,0,0,0,1,1,0,1)
    sortArray(array)

    println("after sort")
    for (i in array.indices) {
        print("${array[i]} ")
    }
    println()
}
