package Programación.UD6.UD6_1.A;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int cont;

        System.out.println("Introduce 10 números: ");

        for (cont = 0; cont < 10; cont++) {
            n[cont] = sc.nextInt();
        }
        System.out.println(Arrays.toString(n));




    }
}
