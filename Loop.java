import java.util.*;
public class Loop {
    public static void main (String[] args){
        // for loop 
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }

        // while (in hindi jabtak in which we give condtition )

        int j =100;
        while (j>=1) {
            System.out.println(j);
            j--;
        }

        // do while loop
        int k=100;
        do{
            System.out.println(k);
            k--;
        } while(k>=1);

        // small code for do while loop 
        Scanner sc=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Input your num:");
            num=sc.nextInt();
            System.out.print("Here your num :");
            System.out.println(num);

        }while(num>=0);
        System.out.println("The End:");
    }
}
