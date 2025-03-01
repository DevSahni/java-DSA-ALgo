public class palimdrom {
    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;

            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racer";
        System.out.println(isPalindrom(str));

    }
}
