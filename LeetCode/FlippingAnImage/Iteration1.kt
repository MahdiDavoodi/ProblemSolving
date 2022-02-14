class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (row in image) {
            val temp = row.reversed()
            for (i in temp.indices) when (temp[i]) {
                0 -> row[i] = 1
                1 -> row[i] = 0
                else -> throw Exception("Something is not right here!")
            }
        }
        return image
    }
}
/**
 * Iterate through the image. For each row, use reversed() function on it.
 * Before you copy the new row into its old place, invert the numbers.(0 -> 1, 1 -> 0)
 * Done.
 */
