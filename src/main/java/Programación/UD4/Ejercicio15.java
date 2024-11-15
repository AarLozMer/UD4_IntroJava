package Programación.UD4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num == 0) {
            System.out.print("No se puede dividir por 0 ");
        }
        else {
            int cociente = num / num2;
            int resto = num % num2;
            System.out.println(num + " entre " + num2 + " da un cociente " + cociente + " y un resto " + resto);
        }
    }
}
