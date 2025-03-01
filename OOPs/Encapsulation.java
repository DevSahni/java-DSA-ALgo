//Encapsulation code  
// 1step create class  with private method 
package OOPs;

/* 
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative !");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: " + account.getBalance());
        account.setBalance(500);
        System.out.println("Balance after setting: " + account.getBalance());
        account.setBalance(-1000);
    }

}
*/
class Student {
    private String name;
    private int age;
    private String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "A");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getGrade());

    }
}