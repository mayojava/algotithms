package arrays

/**
 * implace merge two sorted arrays
 */

fun implaceMerge(x: Array<Int>, y: Array<Int>) {
    for (i in x.indices) {
        if (x[i] > y[0]) {
            var temp = x[i]
            x[i] = y[0]
            y[0] = temp

            //ensure array y remains sorted by making sure the element y[0] is the smallest element in y
            for (j in 1..y.size - 1) {
                if (y[j - 1] > y[j]) {
                    temp = y[j]
                    y[j] = y[j - 1]
                    y[j - 1] = temp
                }
            }
        }
    }
}

