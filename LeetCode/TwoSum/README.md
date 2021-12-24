# Two Sum

✅ Try to solve [this](https://leetcode.com/problems/two-sum/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
>
> You may assume that each input would have exactly one solution, and you may not use the same element twice.
>
> _**Only one valid answer exists.**_


## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++)
                if ((a + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        return result;
    }
}
```

☀️ Result:

> Runtime: 34 ms, faster than 42.80% of Java online submissions for Two Sum.
>
> Memory Usage: 39 MB, less than 88.28% of Java online submissions for Two Sum.

Because of the usage of two for loops, in the worst situation, we have to iterate through the array multiple times.

That leaves us with the time complexity of O(n2). We have to find a way to optimize this operation.
