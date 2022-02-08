fun main() {
    readLine()
    val array = readLine()!!.trim().split(" ").map { x -> x.toInt() }.toIntArray()
    println(equalizeTheArray(array))
}

private fun equalizeTheArray(array: IntArray): Int {
    var max = 0
    array.toSet().forEach { max = maxOf(array.count { x -> x == it }, max) }
    return array.size - max
}

/**
 * Convert the array to a set in order to remove the duplicates.
 * Find the element with most occurrence.
 * Return the array.size - number of that element in your array.
 * */