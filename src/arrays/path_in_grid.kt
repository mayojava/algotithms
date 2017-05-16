package arrays

/**
 * Created by madegeye on 5/16/2017 AD.
 */

fun maxPath(grid: Array<IntArray>) {
    val solution = Array<IntArray>(grid.size) { _ -> IntArray(grid[0].size)}

    (0..grid.size-1).forEach {
        row -> (0..grid[0].size-1).forEach {
            col ->
                if (row == 0 && col == 0) {
                    solution[row][col] = grid[row][col]
                } else {
                    if (col == 0) {
                        solution[row][col] = grid[row-1][col] + grid[row][col]
                    } else if (row == 0) {
                        solution[row][col] = grid[row][col-1] + grid[row][col]
                    } else {
                        solution[row][col] = Math.max(solution[row][col-1], solution[row-1][col]) + grid[row][col]
                    }
                }
        }
    }
    printGrid(solution)
    println(solution[grid.size-1][grid[0].size-1])
}

fun main(args: Array<String>) {
    var array = arrayOf(
            intArrayOf(3,7,9,2,7),
            intArrayOf(9,8,3,5,5),
            intArrayOf(1,7,9,8,5),
            intArrayOf(3,8,6,4,10),
            intArrayOf(6,3,9,7,8)

    )
    maxPath(array)
}

fun printGrid(array: Array<IntArray>) {
    (0..array.size-1).forEach {
        row -> (0..array[row].size-1).forEach {
            print("${array[row][it]} ")
        }
        println()
    }
}