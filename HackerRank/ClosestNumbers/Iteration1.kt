fun closestNumbers(arr: Array<Int>): Array<Int> {
    arr.sort()
    var list = mutableListOf<Int>()
    var minD = Int.MAX_VALUE
    for (i in 0..arr.size - 2) {
        val dif = kotlin.math.abs(arr[i] - arr[i + 1])

        if (dif < minD) {
            minD = dif
            list = mutableListOf()
        }

        if (dif <= minD) {
            list.add(arr[i])
            list.add(arr[i + 1])
        }
    }
    return list.toTypedArray()
}

fun main() {
    readLine()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = closestNumbers(arr)
    println(result.joinToString(" "))
}
/**
 * Sort the array.
 * Iterate on it. In each iteration, check the minimum difference.
 * If you found a new minimum, reset the array.
 * Otherwise, continue to find the pairs with the current minimum difference.
 * */