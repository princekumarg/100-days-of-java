package Stack;

public class TwoStackArr {
    int arr[], cap, top1, top2;

    public TwoStackArr(int x) {
        cap = x;
        top1 = -1;
        top2 = cap;
        arr = new int[x];
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public int pop2() {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stck Underflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStackArr s = new TwoStackArr(5);
        s.push1(2);
        s.push2(3);
        s.push1(4);
        s.push2(5);
        System.out.println(s.pop1());
        System.out.println(s.pop2());
    }
}
