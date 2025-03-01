import java.util.*;
public class Method {
    // creating  function 
    public static void printjava(){
        System.out.println("Hello Java");
    }
    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        printjava();// calling of function 
        printSum(1,5);

    }
}
