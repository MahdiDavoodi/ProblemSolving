fun main() {
    readLine()
    val clouds = readLine()?.split(' ')?.map { x -> x.toInt() }?.toIntArray() ?: intArrayOf(0)
    println(jumps(clouds))
}

fun jumps(array: IntArray): Int {
    var count = 0
    val lastIndex = array.size - 1
    var currentIndex = 0
    var temp: Int

    while (currentIndex < lastIndex) {
        temp = currentIndex + 2
        if (temp > lastIndex || array[temp] == 1) temp--
        count++
        currentIndex = temp
    }

    return count
}

/**
 * Iterate through the array, count your jumps, prefer jumping 2 rather than 1 steps in each iteration.
 * */