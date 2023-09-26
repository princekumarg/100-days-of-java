package OOPS;

public class object {
    public void obj() {
        System.out.println("Prince");
    }

    public String obj1() {
        return "Prince";
    }

    public static void main(String[] args) {
        object name = new object();
        name.obj();
        System.out.println(name.obj1());
    }
}
