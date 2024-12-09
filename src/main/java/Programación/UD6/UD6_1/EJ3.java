package Programación.UD6.UD6_1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n[] = new double[10];
        int count = 0;
        double minimo = 0;
        double maximo = 0;


        System.out.println("Introduce 10 números: ");
        for (count = 0; count <10; count++) {
            n[count] = sc.nextDouble();

            if (n[count] < minimo) {
                minimo = n[count];
            }
            if (n[count] > maximo) {
                maximo = n[count];
            }
        }
        System.out.println("El mínimo es: " + minimo + " y el máximo es: " + maximo);
    }
}
