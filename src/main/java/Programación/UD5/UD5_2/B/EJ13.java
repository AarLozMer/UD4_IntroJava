package src.main.java.Programación.UD5.UD5_2.B;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        char relleno = sc.next().charAt(0);
        System.out.println();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <altura -i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i-1); j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
