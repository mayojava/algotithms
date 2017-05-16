package arrays

/**
 * number of possible ways to select a particular sum from a set of coins
 */

fun possibleSelections(coins: Array<Int>, sum: Int): Int {
    var mem = arrayOfNulls<Int>(sum+1)
    mem[0] = 1

    (1..sum).forEach {
        mem[it] = 0
        (0..coins.size-1)
                .filter { coin -> it - coins[coin] >= 0 }
                .forEach {
                    coin -> mem[it] = mem[it]!! + mem[it - coins[coin]]!!
                }
    }

    return mem[sum]!!
}


fun main(args: Array<String>) {
    val coins = arrayOf(1,3,4)
    (0..9).forEach {
        println(possibleSelections(coins, it))
    }
}