object HandshakeCalculator {
    fun calculateHandshake(number: Int) = Integer.toBinaryString(number).reversed().secretHand()
}

fun String.secretHand(): List<Signal> {
    val result = mutableListOf<Signal>()
    for (it in this.withIndex()) {
        if (it.value == '1') when (it.index) {
            0 -> result.add(Signal.WINK)
            1 -> result.add(Signal.DOUBLE_BLINK)
            2 -> result.add(Signal.CLOSE_YOUR_EYES)
            3 -> result.add(Signal.JUMP)
            else -> result.reverse()
        }
    }
    return result
}

/**
 * Iteration 1 - My way
 * This is probably the longest answer out there.
 * Using Integer.toBinaryString(), you can convert an integer to a string representing its binary form.
 * Then just iterate through that string, and add the proper instances of Signal to your list.
 * */