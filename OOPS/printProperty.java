package OOPS;

public class printProperty {
    public static void main(String[] args) {
        objectProperty pri = new objectProperty();
        pri.name = "Prince";
        pri.rool = 1;
        pri.grade = 'A';
        pri.eat();
        pri.sleep();
        objectProperty raj = new objectProperty();
        raj.name = "raj";
        raj.rool = 2;
        raj.grade = 'B';
        raj.eat();
        raj.sleep();
    }
}
