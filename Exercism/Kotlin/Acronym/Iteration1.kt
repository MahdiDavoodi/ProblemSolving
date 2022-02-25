object Acronym {
    fun generate(phrase: String): String {
        var result = phrase.first().uppercase()
        for (index in 0..phrase.length - 2)
            if (!phrase[index].isAllowed() && phrase[index + 1].isAllowed())
                result += phrase[index + 1].uppercase()
        return result
    }

    private fun Char.isAllowed() = this.isLetter() || this == '\''
}

/**
 * Iteration 1 - My way
 * Iterate through the string. If the character is allowed to be in acronym, add it to the result.
 * Return the result.
 * This took 15 minutes of my life.
 * I hate myself.
 * */