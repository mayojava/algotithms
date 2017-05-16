package arrays

/**
 * find all combination of all given length recursion
 */

fun recurse(array: Array<Int>, output: ArrayList<Int>, index: Int, len: Int) {
    if (len == 0) {
        (0..output.size-1).forEach {
            print("${output[it]} ")
        }
        println()
        return
    }

    if (index == array.size) {
        return;
    }

    output.add(array[index])
    recurse(array, output, index+1, len-1)

    output.remove(array[index])

    recurse(array, output, index+1, len)
}

fun main(args: Array<String>) {
    val array = arrayOf(1,2,3)
    var output = arrayListOf<Int>()
    recurse(array, output, 0, 2)
}
