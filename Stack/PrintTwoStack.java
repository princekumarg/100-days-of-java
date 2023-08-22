package Stack;

public class PrintTwoStack {
    public static void main(String[] args) {
        TwoStack ts = new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("popped element from stack1 is:" + ts.pop1());
        ts.push2(40);
        System.out.println("popped element from stack is:" + ts.pop2());
    }
}
