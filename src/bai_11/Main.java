package bai_11;

import java.util.*;

import static bai_11.SNT.isSNT;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        stackk(n);
        queuee(n);
    }

    public static void stackk(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            if (isSNT(i)) {
                stack.add(i);
            }
        }
        System.out.println(stack);
    }

    public static void queuee(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (isSNT(i)) {
                queue.add(i);
            }
        }
        System.out.println(queue);
    }
}
