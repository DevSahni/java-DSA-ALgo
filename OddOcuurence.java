import java.util.*;

public class OddOcuurence {
    // we use XOR operations here for checking podd ouccrance of a number
    public static int findOdd(int[] arr) {
        int result = 0;
        for (int n : arr) {
            result ^= n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 4, 4, 5 };
        System.out.println(findOdd(arr));

    }

}
