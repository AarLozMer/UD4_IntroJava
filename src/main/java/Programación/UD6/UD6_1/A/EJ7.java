package Programación.UD6.UD6_1.A;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int P = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int Q = sc.nextInt();

        for  (int count = P; count <= Q; count++) {
            System.out.print(count +" ");

        }


    }
}
