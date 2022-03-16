fun main() {
    readLine()
    val sticks = readLine()
        ?.split(' ')
        ?.map { x -> x.toInt() }
        ?.toList() ?: listOf(0, 0, 0)
    cutTheSticks(sticks)
}

fun cutTheSticks(list: List<Int>) {
    if (list.isEmpty()) return
    println(list.size)
    val min = list.minByOrNull { it } ?: 0 // .minBy in older versions
    if (min > 0) {
        val newList = list.map { it - min }.filter { x -> x > 0 }.toList()
        cutTheSticks(newList)
    }
}

/**
 * Find the minimum value, cut the sticks, print the number of remaining, do it until the list is empty!
 * */