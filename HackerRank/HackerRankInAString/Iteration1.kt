fun main() = repeat(readLine()?.toInt() ?: 0) {
    println(
        if ((readLine() ?: "")
                .isHackerRanked()
        ) "YES" else "NO"
    )
}

fun String.isHackerRanked(): Boolean {
    val hackerrank = "hackerrank"
    var index = 0
    for (char in this)
        when {
            index == hackerrank.length - 1 -> return true
            char == hackerrank[index] -> index++
        }
    return index == hackerrank.length - 1
}

/**
 * Iterate through the string and check for the characters.
 * */