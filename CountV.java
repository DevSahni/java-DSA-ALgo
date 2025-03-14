package TCSNQT;

import java.util.*;

public class CountV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, constant = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    constant++;
                }
            }
        }
        System.out.println(vowels + " " + constant);

    }

}
