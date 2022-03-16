fun main() {
    val input = readLine()?.split(' ')?.map { x -> x.toInt() }?.toList() ?: listOf(0, 1, 1)
    println((input[0]..input[1]).countBeautiful(input[2]))
}

fun Int.isBeautiful(k: Int): Boolean {
    val reverse = this.toString().reversed().toInt()
    return kotlin.math.abs(this - reverse).rem(k) == 0
}

fun IntProgression.countBeautiful(k: Int) = this.count { it.isBeautiful(k) }

/**
 * Create an Int progression from i to j.
 * Count all the beautiful days!
 * */