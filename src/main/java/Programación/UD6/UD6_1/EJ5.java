package Programación.UD6.UD6_1;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n[] = new double[20];
        double suma = 0;
        double longitud = 20;
        double media = 0;
        int count = 0;

        System.out.println("Introduce 20 números: ");

        for (count = 0; count < 20; count++) {
            n[count] = sc.nextDouble();
            suma += n[count];
        }

        media = suma / longitud;
        System.out.println("Media: " + media);
    }
}
