import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine().trim().split(" ")[1]);
        Optional<Integer> max = Arrays.stream(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt).max(Integer::compareTo);
        if (max.isPresent() && max.get() > k)
            System.out.println(max.get() - k);
        else System.out.println(0);
        scanner.close();
    }
}
