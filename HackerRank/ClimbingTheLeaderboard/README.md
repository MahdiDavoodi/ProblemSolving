# Climbing the Leaderboard

✅ Try to solve [this](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on HackerRank.com

> An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
>
> -   The player with the highest score is ranked number 1 on the leaderboard.
> -   Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    List<Integer> results = new ArrayList<>();
    for (Integer integer : player) {
        ranked.add(integer);
        ranked = new ArrayList<>(new HashSet<>(ranked));
        Collections.sort(ranked);
        // Need improvements.
        results.add(Math.abs(ranked.indexOf(integer) - ranked.size()));
    }
    return results;
}
```
> Java

Create a list named `results`. Iterate through the `player`. Add each record to the `ranked` list and sort it. Find the index of the record that you added, and add it to the `results` list. Return the `results`.

**Note**: This solution failed at 4 test cases (Terminated due to timeout). It needs improvements.
