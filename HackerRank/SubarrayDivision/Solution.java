import java.util.*;
import java.util.stream.Collectors;

class Result {
    public static int birthday(List<Integer> list, int d, int m) {
        int n = list.size();
        int count = 0;
        for (int i = 0; i <= n - m; i++)
            if (n >= i + m)
                if (list.subList(i, i + m).stream().reduce(0, Integer::sum) == d)
                    count++;
        return count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> list = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int d = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(Result.birthday(list, d, m));
    }
}
