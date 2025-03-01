import java.util.*;

public class Try_Catch {
    public static void main(String[] args){
        // exception Handling
        int [] marks={12,34,56,100};
        try{
        System.out.println(marks[5]);
        }catch(Exception e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("The name is aman");
    }
}
