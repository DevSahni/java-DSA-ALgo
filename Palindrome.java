public class Palindrome {

    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) !=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="dED";
        Palindrome p = new Palindrome();
        Boolean result =p.isPalindrome(s);
        System.out.println(result);
    }
}
