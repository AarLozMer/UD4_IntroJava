package Programación.UD4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = sc.nextDouble();
        System.out.print("Ingrese el precio descuento: ");
        double precioDescuento = sc.nextDouble();
        double porcentajeDescuento = precioDescuento / precioOriginal * 100;
        System.out.print("El porcentaje de descuento es: " + porcentajeDescuento);
    }
}
