fun maximumToys(p: Array<Int>, k: Int): Int {
    var budget = k
    var count = 0
    for (i in p.sorted())
        if (budget >= i) {
            budget -= i
            count++
        } else break
    return count
}

fun main() {
    val input = readLine()!!.trimEnd().split(" ")
    val k = input[1].toInt()
    val prices = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    println(maximumToys(prices, k))
}

/**
 * Sort the prices.
 * Count the toys that are available for buying.
 * */