fun main() {
    val s = readLine()!!
    val t = readLine()!!
    val k = readLine()!!.toInt()

    val minDif = s editCount t
    println(
        when {
            k >= t.length + s.length || (k % 2 == minDif % 2 && k >= minDif) -> "Yes"
            else -> "No"
        }
    )
}


infix fun String.editCount(other: String): Int {
    for (index in 0..maxOf(this.length, other.length)) {
        when {
            index >= other.length || index >= this.length -> return kotlin.math.abs(this.length - other.length)
            this[index] != other[index] -> return (this.length - index) + (other.length - index)
        }
    }
    return 0
}
/**
 * This passes the tests, I don't fucking know why.
 * */