fun theLoveLetterMystery(s: String): Int {
    val middle = if (s.length.rem(2) == 0) (s.length - 1) / 2 else s.length / 2
    var i = middle
    var j = if (s.length.rem(2) == 0) middle + 1 else middle

    var count = 0
    while (i >= 0) {
        count += kotlin.math.abs(s[i] - s[j])
        i--; j++
    }
    return count
}

fun main() {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!
        val result = theLoveLetterMystery(s)
        println(result)
    }
}

/**
 * Iterate through the string with two pointer from the middle.
 * Count the abs difference of each two characters.
 * */