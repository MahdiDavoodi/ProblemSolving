# Migratory Birds

✅ Try to solve [this](https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem on HackerRank.com

> Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    List<Integer> array = Arrays.stream(scanner.nextLine().trim().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());

    HashSet<Integer> set = new HashSet<>(array);
    int max = Integer.MIN_VALUE;
    int number = Integer.MIN_VALUE;
    for (Integer integer : set) {
      int frequency = Collections.frequency(array, integer);
      if (max < frequency) {
        max = frequency;
        number = integer;
      }
    }
    System.out.println(number);
    scanner.close();
  }
}
```
Scan the whole input, parse it into an array of integers, and store it into a variable. Get a set copy of the array (To remove the same values). Then create a `for` loop that gets a frequency of each element in your set, **on** the array.
