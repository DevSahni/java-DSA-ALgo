package OOPs;

class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Inherit {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(5, 6);
        Circle ci = new Circle(6);
        System.out.println(re.area());
        System.out.println(ci.area());
    }
}