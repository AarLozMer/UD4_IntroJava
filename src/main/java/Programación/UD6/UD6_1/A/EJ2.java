package Programación.UD6.UD6_1.A;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int count;
        int suma = 0;
        System.out.println("Introduce 10 números reales");
        for (count = 0; count < 10; count++) {
            n[count] = sc.nextInt();
            suma = suma + n[count];
            if (n[count] < 0) {
                System.out.println("No se pueden poner números negativos");
                break;
            }

        }
        System.out.println("Esta es la suma de los números reales: " + suma);
    }
}
