package OOPS;

class Car {
    public String model;
    public String make;
    public String color;
    public int price;
    private String cNo = "abc123";

    public void start() {
        System.out.println("Car is starting...");
    }

    public void printNo() {
        System.out.println(cNo);
    }
}

public class AccessModifer {
    public static void main(String[] args) {
        Car kia = new Car();

        kia.price = 100;
        kia.start();
        kia.printNo();
        System.out.println(kia.price);
    }
}
