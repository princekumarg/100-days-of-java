package OOPS;

class Animal {
    String name;
    String bread;
    String color;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is Eating");
    }
}

class Dog extends Animal {
    public void pet() {
        System.out.println(name + "is now a pet");
    }

    public void walk() {
        System.out.println(name + " New Walik Function");
    }
}

class Lion extends Animal {
    public void killAnimals() {
        System.out.println("Killing animals");
    }
}

class Lab extends Dog {
    Lab() {
        color = "Golden";
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog gs = new Dog();
        Lab lab = new Lab();
        Lion lion = new Lion();
        gs.name = "German Dog";
        System.out.println("color is" + lab.color);
        lion.killAnimals();
        gs.pet();
        gs.walk();
    }
}
