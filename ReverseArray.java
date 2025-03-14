import java.util.*;

public class ReverseArray {
    public void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6, 7 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

}
