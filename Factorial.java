public class Factorial {
static int factorial(int X) {
    int ans = 1;
    for (int i = 1; i <= X; i++) {
       ans = ans * i;
    }
    return ans;
 }
 public static void main(String[] args) {
    int num = 5;
    int result = factorial(num);
    System.out.println(result);
 }
}