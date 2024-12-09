package src.main.java.Programación.UD5.UD5_2.B;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 1; i < num; i++) {
                System.out.print("*");
            }

        }else if (num < 0) {
            for (int i = 0; i < Math.abs(num); i++) {
                System.out.print("#");
            }
        }else {
            System.out.println("El numero es 0, no se imprime ningún carácter");
        }
    }
}
