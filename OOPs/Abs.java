package OOPs;

abstract class Vehicle {
    abstract void start();
}

interface Horn {
    void blowHorn();

}

class Car extends Vehicle implements Horn {
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    public void blowHorn() {
        System.out.println("Beep beep!");
    }
}

public class Abs {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.start();
        mycar.blowHorn();

    }
}
