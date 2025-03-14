package TCSNQT;

import java.util.*;

class Reverseji {
    void reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("Reverse of number is " + rev);

    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        Reverseji re = new Reverseji();
        re.reverseNumber(12345);

    }

}
