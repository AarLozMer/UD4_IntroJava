package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ7 {
public static void main(String[] args) {
    int positivo = 0;
    int negativo = 0;

    for (int i = 0; i <= 10; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        if (n >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
    }

    System.out.println("Hay " + positivo + " positivos y " + negativo + " negativos");
    }
}
