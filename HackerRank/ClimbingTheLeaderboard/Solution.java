import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> ranked = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int m = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> player = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer :
                climbingLeaderboard(ranked, player)) {
            System.out.println(integer);
        }
    }

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
}
