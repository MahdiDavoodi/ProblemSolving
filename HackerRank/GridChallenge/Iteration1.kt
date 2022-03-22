fun List<Char>.isSorted(other: List<Char>): Boolean {
    for (i in this.indices) {
        if (this[i] > other[i]) return false
    }
    return true
}

fun gridChallenge(grid: Array<String>): String {
    var temp = grid.first().toList().sorted()

    for (str in grid) {
        val t = str.toList().sorted()

        if (temp.isSorted(t))
            temp = t
        else return "NO"
    }
    return "YES"
}

fun main() {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val grid = Array(n) { "" }
        for (i in 0 until n) {
            val gridItem = readLine()!!
            grid[i] = gridItem
        }

        val result = gridChallenge(grid)

        println(result)
    }
}
/**
 * Pretty simple one.
 * Just iterate through the array, sort the strings and compare them to one anohter.
 * */