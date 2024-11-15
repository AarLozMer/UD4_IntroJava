package Programación.UD4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el  numero entero positivo: ");
        int numero = input.nextInt();

        if (numero <= 0) {
            System.out.println("El numero entero no puede ser menor o igual que 0");
        }
        else {
            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma += i;
            }
            System.out.println("La suma de los primeros " + numero + " enteros es: " + suma);

        }

    }

}
