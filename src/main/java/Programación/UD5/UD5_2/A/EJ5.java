package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        int b;

        for (b = n-1; b >= 1; b--){
            n = n * b;
        }
        System.out.println(n);
    }
}
