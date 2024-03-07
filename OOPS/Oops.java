package OOPS;
/*
  OBJECT===="Objects are real-world entities that contain specific data or information"
  CLASSES==="A class can be considered as a blueprint or template for creating similar types of objects"
  METHODS==="A class can be considered as a blueprint or template for creating similar types of objects"
*/

class Animal {
    String color;
    String name;
    String bread;
    int age;

    // *****Methods*****//
    void run() {
        System.out.println(name + " is running");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    // *****Construction*****/
    Animal() {
        color = "black";
    }

    Animal(String anicolor, int aniage) {
        color = anicolor;
        age = aniage;
    }

}

public class OOPS {
    public static void main(String[] args) {
        Animal dog = new Animal("White", 5);
        dog.color = "Black";
        dog.name = "Tommy";
        dog.bread = "German-shaferd";
        // dog.age = 5;

        Animal cow = new Animal("Golden", 6);
        cow.color = "White";
        cow.name = "Ganga";
        cow.bread = "Sahiwal";
        // cow.age = 3;
        System.out.println(dog.name + " " + dog.color + " " + dog.bread + " " + dog.age);
        System.out.println(cow.name + " " + cow.color + " " + cow.bread + " " + cow.age);
        Animal lion = new Animal("White", 15);
        // lion.color=IT WILL COMES FROM CONSTRUCTOR
        lion.name = "Ganga";
        lion.bread = "Sahiwal";
        lion.age = 3;
        // *****Method Printing*****//
        dog.run();
        cow.eat();
        dog.eat();
        cow.run();
        // *****Constructor printing*****//
        System.out.println(lion.color + " " + dog.color + " " + cow.color);
        System.out.println(
                lion.age + " " + lion.color + " " + cow.age + " " + cow.color + " " + dog.name + " " + dog.color);

    }
}
