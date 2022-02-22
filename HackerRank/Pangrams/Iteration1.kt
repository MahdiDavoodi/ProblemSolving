fun main() = println(
    if ((readLine() ?: "")
            .filter { it.isLetter() }
            .map { it.toLowerCase() }
            .distinct().size == 26
    ) "pangram" else "not pangram"
)

/**
 * Works fine but needs improvement.
 * Use it.lowerCase in higher versions of Kotlin.
 * */