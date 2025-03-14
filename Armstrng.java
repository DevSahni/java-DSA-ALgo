package TCSNQT;

import java.util.*;

public class Armstrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int original = n, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");

        } else {
            System.out.println("Not a Armstrong");
        }

    }

}
