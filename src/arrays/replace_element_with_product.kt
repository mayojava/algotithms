package arrays

/**
 * replace all elements in an array with the product of all other elements
 */
fun replaceWithProduct(array: Array<Int>) {
    val left = IntArray(array.size)
    var right = IntArray(array.size)

    left[0] = 1
    right[array.size-1] = 1

    (1..array.size-1).forEach {
        val prevElem = array[it-1]
        var productToLeftOfPrevElement = left[it-1]

        left[it] = array[it-1] * left[it-1]
    }

    (array.size-2 downTo 0).forEach {
        right[it] = array[it+1] * right[it+1]
    }

    (0..array.size-1).forEach {
        array[it] = left[it] * right[it]
    }

}

fun main(args: Array<String>) {
    val array = arrayOf(1,2,3,4,5)
    replaceWithProduct(array)
    (0..array.size-1).forEach { print("${array[it]} ") }
}