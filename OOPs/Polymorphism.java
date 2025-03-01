package OOPs;

// Method Overloading  concepts
class Calculator {
    int add(int a, int b) {
        return a + b;

    }

    int add(int a, int b, int c) {
        return a + b + c;

    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] agrs) {
        Calculator obj = new Calculator();
        System.out.println(+obj.add(5, 10));
        System.out.println(+obj.add(5, 10, 11));
        System.out.println(+obj.add(5.5, 10.1));
    }
}
