package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer valor: ");
        int a = sc.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int b = sc.nextInt();

        int potencia = (int) Math.pow(a, b);

        System.out.println("La potencia es: " + potencia);

    }
}
