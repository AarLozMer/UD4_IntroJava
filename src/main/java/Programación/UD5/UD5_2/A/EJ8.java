package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int n = 0;
       do {
            System.out.print("Ingrese un numero: ");
            n = sc.nextInt();
            if (n >= 0) {
                positivo= positivo + 1;
            } else {
                negativo = negativo + 1;
            }
        }  while (n != 0);
        System.out.println("Hay " + negativo + " negativos y " + positivo + " positivos");
    }
}
