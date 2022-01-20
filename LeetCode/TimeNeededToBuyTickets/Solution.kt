class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var time = 0
        while (tickets[k] > 0) {
            for (i in tickets.indices) {
                if (tickets[i] > 0) {
                    tickets[i]--
                    time++
                }
                if (tickets[k] <= 0) break
            }
        }
        return time
    }
}

/*
* Iterate through the array, decrease all numbers. Count every time someone gets ticket.
* If (k) is receiving its last ticket, break the loop.
* (Should improve this solution).
*/