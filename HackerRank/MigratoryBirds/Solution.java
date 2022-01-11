import java.util.*;
import java.util.stream.Collectors;

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
