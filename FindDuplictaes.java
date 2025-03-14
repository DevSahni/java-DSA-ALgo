import java.util.*;

public class FindDuplictaes {
    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupli = new HashSet<>();
        for (int n : arr) {
            if (!seen.contains(n)) {
                dupli.add(n);
            }
        }
        return new ArrayList<>(dupli);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4, 4, 5, 5, 6 };
        System.out.println(findDuplicates(arr));

    }

}
