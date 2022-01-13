# Merge Sorted Array

✅ Try to solve [this](https://leetcode.com/problems/merge-sorted-array/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
>
> Merge nums1 and nums2 into a single array sorted in non-decreasing order.
>
> The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt
> Python

```python
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        for i in range(n):
            nums1[m + i] = nums2[i]
        nums1.sort()
```

Just fill the first array with the second one. Then sort the whole array using `.sort()`.

☀️ Result:

> Runtime: 36 ms, faster than 77.35% of Python3 online submissions for Merge Sorted Array.
>
> Memory Usage: 14.3 MB, less than 62.53% of Python3 online submissions for Merge Sorted Array.
