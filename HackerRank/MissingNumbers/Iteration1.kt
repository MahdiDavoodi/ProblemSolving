fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Set<Int> {
    val map = mutableMapOf<Int, Int>()
    for (i in brr) map[i] = (map[i] ?: 0) + 1

    for (i in arr) {
        map[i] = (map[i] ?: 1) - 1
        if ((map[i] ?: 0) == 0) map.remove(i)
    }

    return map.keys.toSortedSet()
}

fun main() {
    readLine()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    readLine()
    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    println(missingNumbers(arr, brr).joinToString(" "))
}

/**
 * Store all the frequencies of brr in a map.
 * Reduce from them by checking the arr.
 * If the frequency becomes 0, it means that element is not missing in the arr.
 * */
