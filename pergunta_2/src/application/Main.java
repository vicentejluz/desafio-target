package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int previous = 0, next = 1;
        int fibonacci[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = previous + i;
            } else {
                fibonacci[i] = previous + next;
                previous = next;
                next = fibonacci[i];
            }
        }

        if (hasFibonacci(fibonacci, n))
            System.out.println("Valor " + n + " pertence a sequência.");
        else
            System.out.println("Valor " + n + " não pertence a sequência.");

        sc.close();
    }

    public static boolean hasFibonacci(int[] fibonacci, int n) {
        for (int i = 0; i < n; i++) {
            if (fibonacci[i] == n)
                return true;
        }
        return false;
    }

}
