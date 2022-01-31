import java.math.BigInteger

fun main() = println(factorial(BigInteger(readLine()!!.trim())))

fun factorial(number: BigInteger): BigInteger {
    return if (number == BigInteger("1")) BigInteger("1")
    else number.multiply(factorial(number.minus(BigInteger("1"))))
}

/**
 * Using recursion, you can solve this problem in less than 5 minutes.
 * */