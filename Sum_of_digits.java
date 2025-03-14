package TCSNQT;

class Sum {
    void sumdigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digits = n % 10;
            sum += digits;
            n /= 10;
        }
        System.out.println("The sum of digits is :" + sum);
    }
}

public class Sum_of_digits {
    public static void main(String[] args) {
        // int n = 12345;
        Sum obj = new Sum();
        obj.sumdigits(12345);
        // int sum = 0;
        // while (n != 0) {
        // int digit = n % 10;
        // sum += digit;
        // n /= 10;
        // }
        // System.out.println("Sum of digits is: " + sum);
    }

}
