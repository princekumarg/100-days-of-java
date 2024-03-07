package OOPS;

abstract class Car {
    String model;
    String name;
    int price;

    abstract void startEngin();
}

class kia extends Car {
    void startEngin() {
        System.out.println("start Engine");
    }
}

class Toyota extends Car {
    void startEngin() {
        System.out.println("Start engin of Toyata");
    }
}

public class Abstraction {
    public static void startcar(Car car) {
        car.startEngin();
    }

    public static void main(String[] args) {
        kia k = new kia();
        // k.startEngin();
        startcar(k);
    }

}
