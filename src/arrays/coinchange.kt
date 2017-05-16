package arrays

/**
 * coin change dynamic programming solution
 */

fun coinChange(coins: Array<Int>, value: Int): Int {
    val mem = arrayOfNulls<Int>(value+1)
    mem[0] = 0
    val selected = arrayOfNulls<Int>(value+1)

    (1..value)
            .forEach {
                var min = Integer.MAX_VALUE

                (0..coins.size-1)
                        .filter { coin -> it - coins[coin] >= 0}
                        .forEach {
                            coin -> min = Math.min(min, mem[it - coins[coin]]!! + 1)
                            mem[it] = min
                            selected[it] = coins[coin]
                        }
            }

    print("$value -> {")
    var mutatedValue = value
    while (mutatedValue > 0) {
        print("${selected[mutatedValue]} ")
        mutatedValue -= selected[mutatedValue]!!
    }
    println("}")
    return mem[value]!!
}

fun main(args: Array<String>) {
    val coins = arrayOf(1,3,4)
    (1..10).forEach {
        coinChange(coins, it)
    }
}