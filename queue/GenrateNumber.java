package queue;

import java.util.LinkedList;
import java.util.Queue;

//56 number are 5,6,55,56,55,556,565,566,65,66,656,666
public class GenrateNumber {
    public static void generateN(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for (int i = 0; i < n; i++) {
            String curr = q.peek();
            System.out.println(curr + " ");
            q.remove();
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateN(n);
    }
}
