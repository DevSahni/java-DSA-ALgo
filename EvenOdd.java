public class EvenOdd {
    public static void countevenodd(int[] arr) {
        int evencount = 0, oddcount = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Even numbers count: " + evencount + " odd count =" + oddcount);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8, 1 };
        countevenodd(arr);

    }

}
