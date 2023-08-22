package Stack;

public class TwoStack {
    int[] arr;
    int size;
    int top1, top2;

    TwoStack(int n) {
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }

    public void push1(int x) {
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow By element:" + x);
            return;
        }
    }

    public void push2(int x) {
        if (top2 < size - 1) {
            top2++;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow By element:" + x);
            return;
        }
    }

    public int pop1() {
        if (top1 <= size / 2) {
            int x = arr[top1];
            top1++;
            return x;
        } else {
            System.out.println("Stack UnderFlow");
            System.exit(1);
        }
        return 0;
    }

    public int pop2() {
        if (top2 >= size / 2 + 1) {
            int x = arr[top2];
            top2--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 1;
    }
}
