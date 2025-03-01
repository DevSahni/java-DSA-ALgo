import java.util.*;
class LCM{

    public static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b,int hcf){
        return (a*b)/hcf;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 =sc.nextInt();
        System.out.println("Enter second number :");
        int num2 =sc.nextInt();
        int hcf=hcf(num1,num2);
        int lcm=lcm(num1,num2,hcf);
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);

}
}