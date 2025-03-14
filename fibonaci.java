package TCSNQT;

import java.util.*;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbver to get fibonacci :");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Fibonacci number at position " + n + " is " + b);

    }

}
