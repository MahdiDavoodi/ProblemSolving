fun divisibleSumPairs(k: Int, ar: Array<Int>): Int {
    var count = 0
    for (i in ar.indices) for (j in ar.indices) if (i < j && (ar[i] + ar[j]) % k == 0) count++
    return count
}

fun main() = println(
    divisibleSumPairs(
        readLine()!!.trimEnd().split(" ")[1].toInt(),
        readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    )
)
