package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(charArray);

    }

}
