package Stack;

public class Kstack {
    int arr[], top[], next[];
    int k, freetop, cap;

    Kstack(int k1, int n) {
        k = k1;
        cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
        freetop = 0;
        for (int i = 0; i < cap - 1; i++) {
            next[i] = i + 1;
        }
        next[cap - 1] = -1;
    }

    public void push(int x, int sn) {
        int i = freetop;
        freetop = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i] = x;
    }

    public int pop(int sn) {
        int i = top[sn];
        top[sn] = next[i];
        next[i] = freetop;
        freetop = i;
        return arr[i];
    }

    public static void main(String[] args) {
        Kstack ks = new Kstack(2, 3);
        ks.push(10, 0);
        ks.push(20, 0);
        ks.push(30, 0);
        ks.push(40, 1);
        ks.push(50, 1);
        System.out.println(ks.pop(0));
    }
}
