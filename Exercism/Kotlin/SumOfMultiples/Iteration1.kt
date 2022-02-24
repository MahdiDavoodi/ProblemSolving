object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val new = factors.toSortedSet()
        return (0 until limit).filter { new checkFactors it }.sum()
    }

    private infix fun Set<Int>.checkFactors(n: Int): Boolean {
        for (factor in this) if (factor != 0) if (n.rem(factor) == 0) return true
        return false
    }
}

/**
 * Iteration 1 - My way
 * Filtered those numbers that have at least one factors in the given set.
 * Calculated the sum of them.
 * */