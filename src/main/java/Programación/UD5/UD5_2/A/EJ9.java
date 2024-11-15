package Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int n = 0;
        int suma = 0;
        int producto = 1;
        int contador = 0;

        for (contador = 1; contador <= max; contador++) {
            int acumuladorsuma = suma;
            int acumuladorprod = producto;
            suma = acumuladorsuma + contador;
            producto = acumuladorprod * contador;


        }
        System.out.print("La suma es de: " + suma + " el producto es: " + producto);
    }
}
