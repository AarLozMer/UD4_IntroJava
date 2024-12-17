package Programación.UD6.UD6_1.A;

import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int N = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int M = sc.nextInt();

        int tamaño[] = new int[N];

        Arrays.fill(tamaño, M);
        System.out.println(Arrays.toString(tamaño));
    }
}
