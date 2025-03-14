package TCSNQT;

import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        Boolean isPrime = n > 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                ;
            isPrime = false;
            break;
        }
        if (isPrime) {
            System.out.println(" Not Prime");

        } else {
            System.out.println("Prime");
        }
    }

}
