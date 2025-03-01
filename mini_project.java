import java.util.*;
public class mini_project {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int GuessNum=0;
        int myNum=(int)(Math.random()*100);
        do{
            System.out.println("Guess my number:");
            GuessNum= sc.nextInt();
            if (GuessNum==myNum) {
                System.out.println("ohhooo ..... right :");
                break;
            }
            else if (GuessNum>myNum) {
                System.out.println("Yoyr num is to large ");
            }
            else{
                System.out.println("Your num is too small");
            }

        }while(GuessNum>=0);
        System.out.println("My num was.....");
        System.out.println(myNum);
    }
}
