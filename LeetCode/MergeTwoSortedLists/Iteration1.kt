class Solution {
    fun mergeTwoLists(firstNode: ListNode?, secondNode: ListNode?): ListNode? {
        return if (firstNode == null) secondNode
        else if (secondNode == null) firstNode
        else {
            val newNode = ListNode(if (firstNode.`val` > secondNode.`val`) secondNode.`val` else firstNode.`val`)
            newNode.next = if (newNode.`val` == firstNode.`val`) mergeTwoLists(firstNode.next, secondNode)
            else mergeTwoLists(firstNode, secondNode.next)
            newNode
        }
    }
}
/**
 * Solved this one using recursion.
 * In each call, it will return a new node with the min value of two inputs.
 * Before it ends, it call itself to evaluate the next node of the new node.
*/