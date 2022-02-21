fun main() = println(
    if (readLine()!! editCount readLine()!! <= readLine()!!.toInt()) "Yes"
    else "No"
)

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
 * I didn't solve this problem.
 * I just wrote something that passes 12/14 test cases.
 * This is not the solution.
 * */