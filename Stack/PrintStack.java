package Stack;

public class printstack {
    public static void main(String[] args) {
        // MyStackArr s = new MyStackArr(5);
        MyStackLL s = new MyStackLL();
        s.push(10);
        s.push(20);
        System.out.print(s.pop());
        s.push(30);
        System.out.println();
        System.out.print(s.peek());
    }
}
