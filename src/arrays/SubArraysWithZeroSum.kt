package arrays

/**
 * prints all sub arrays within an array with zero sum
 */

fun main(args: Array<String>) {
    val array = arrayOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)
    printAllSubArraysWithSumZero(array)
}

fun printAllSubArraysWithSumZero(array: Array<Int>) {
    var sum = 0
    val map = mutableMapOf<Int, ArrayList<Int>>()

    for (i in array.indices) {
        sum += array[i]

        if (sum == 0) {
            //print all elements from index 0 to this index
            for (j in array.indices) {
                if (j > i) {
                    break;
                }

                print("%d,".format(array[j]))
            }

            println()
        }

        if (map.containsKey(sum)) {
            var list = map[sum]!!
            display(list, i, array)
        }

        insert(map, sum, i)
    }
}

fun insert(map: MutableMap<Int, ArrayList<Int>>, key: Int, value: Int) {
    if (map.containsKey(key)) {
        val list = map[key]!!
        list.add(value)
    } else {
        val list = arrayListOf<Int>(value)
        map.put(key, list)
    }
}

fun display(list: ArrayList<Int>, currentIndex: Int, array: Array<Int>) {
    for (i in list.indices) {
        val startIndex = list.get(i) + 1

        for (x in startIndex..currentIndex) {
            print("%d,".format(array[x]))
        }
        println()
    }
}