package arrays

/**
 * Find all combinations of given length within a string
 */

fun findCombo(array: Array<Int>, output: String, index: Int, len: Int) {
    if (len > array.size) {
        return
    }

    if (len == 0) {
        println(output)
        return
    }

    (index..array.size-1).forEach {
        findCombo(array, "$output ${array[it]}", it+1, len-1)
    }
}

fun main(args: Array<String>) {
    var array = arrayOf(1,1,2,3)
    findCombo(array, "", 0, 2)
}