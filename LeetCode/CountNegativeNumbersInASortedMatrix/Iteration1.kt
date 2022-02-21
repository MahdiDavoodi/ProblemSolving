class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (i in grid.size - 1 downTo 0){
            if (grid[i].last() < 0)
                for (j in grid[i].size - 1 downTo 0){
                    if (grid[i][j] < 0) count++
                    else break
                }
                else break
        }
        return count
    }
}