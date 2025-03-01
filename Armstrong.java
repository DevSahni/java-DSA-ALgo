
import java.util.*;

public class  Armstrong{
    public static void main(String[] args) {
    int n,arms=0,c,r;
    System.out.print("Enter a any number : ");
    Scanner sc = new Scanner (System.in);
    n=sc.nextInt();
    c=n;
    while(n>0){
      r=n%10;
      arms = (r*r*r)+arms;
      n/=10;
    }
    if(c==arms){
      System.out.print("Armstrong numbver ");
    }else{
      System.out.print("NO");
    }
  }
}