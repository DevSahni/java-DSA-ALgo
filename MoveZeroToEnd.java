import java.util.*;

public class MoveZeroToEnd {

    public void movezeros(int[] arr) {
        int index = 0;
        for (int n : arr) {
            if (n != 0) {
                arr[index++] = n;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0 };
        MoveZeroToEnd obj = new MoveZeroToEnd();
        obj.movezeros(arr);
        System.out.println(Arrays.toString(arr));
    }

}
