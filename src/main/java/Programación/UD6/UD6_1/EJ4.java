package Programación.UD6.UD6_1;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[20];
        int sumapos = 0;
        int sumaneg = 0;
        int acumpos = 0;
        int acumneg = 0;
        int count = 0;
        System.out.println("Introduce 20 números: ");
        for (count = 0; count < 20; count++) {
            n[count] = sc.nextInt();

            if (n[count] > 0) {

                acumpos += n[count];
            }
            if (n[count] < 0) {

                acumneg += n[count];


            }
        }
        System.out.println("Este es el resultado de la suma de los negativos: " + acumneg + " este es el resultado de la suma de los positivos: " + acumpos);



    }
}
