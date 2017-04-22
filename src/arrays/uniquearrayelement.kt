package arrays

/**
 * gets the unique element from an array
 * all elements in the array are from 1 - n-1 where n = length of array
 */

fun getUniqueElement(array: Array<Int>) {
    array.indices
            .map { Math.abs(array[it]) }
            .forEach {
                if (array[it] < 0) {
                    println(Math.abs(array[it]))
                } else {
                    array[it] *= -1
                }
            }
}

fun main (args: Array<String>) {
    getUniqueElement(arrayOf(9,2,5,3,8,7,6,3,1,4))
}
