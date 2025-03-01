package Array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 6, 4, 3, -1, -9 };
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int num : arr) {
            currentsum = Math.max(num, currentsum + num);
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println("Maximum Subarray Sum is: " + maxsum);
    }

}
