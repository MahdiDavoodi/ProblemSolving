import kotlin.math.*

object Darts {

    fun score(x: Number, y: Number): Int {
        val a = abs(x.toDouble())
        val b = abs(y.toDouble())
        val c = sqrt(a.pow(2) + b.pow(2))
        return when {
            c > 10 -> 0
            c > 5 -> 1
            c > 1 -> 5
            else -> 10
        }
    }
}

/**
 * Iteration 1 - My way
 * I used Number as input type because both Double and Int are subclasses of Number.
 * Using Pythagoras Theorem, you can calculate the radius of the circle where your dart landed on.
 * Then you just need to return the proper point by comparing the result.
 * */