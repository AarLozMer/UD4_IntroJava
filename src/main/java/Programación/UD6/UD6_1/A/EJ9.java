package Programación.UD6.UD6_1.A;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aleatorio = new int[100];

        System.out.print("Introduzca un numero entre 0 y 100: ");
        int n = sc.nextInt();

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random()*10);
            if (aleatorio[i] == n) {
                System.out.print(i + " ");
            }
        }
    }
}
