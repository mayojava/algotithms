package arrays

/**
 * merge two arrays by satisfying given constraints
 */
fun merge(x: Array<Int>, y: Array<Int>) {
    //move all non zero elements in x to the beginning of the array
    var k = 0
    for (i in x.indices) {
        if (x[i] != 0) {
            x[k++] = x[i]
        }
    }

    reArrange(x, y, k-1, y.size-1)
}

fun reArrange(x: Array<Int>, y: Array<Int>, m: Int, n: Int) {
    var k = m + n + 1
    var m = m
    var n = n

    while (m >=0 && n >= 0) {
        if (x[m] > y[n]) {
            x[k--] = x[m--]
        } else {
            x[k--] = y[n--]
        }
    }

    while (n >= 0) {
        x[k--] = y[n--]
    }
}

fun main (args: Array<String>) {
    val x = arrayOf(0,2,0,3,0,5,6,0,0)
    val y = arrayOf(1, 8, 9, 10, 15)
    merge(x, y)

    x.forEach { print("$it ") }
}