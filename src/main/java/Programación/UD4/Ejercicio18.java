package Programación.UD4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de barras frescas: ");
        double frescas = sc.nextDouble();
        System.out.print("Ingrese el numero de barras duras: ");
        double duras = sc.nextDouble();
        double preciofrescas = frescas * 1.20;
        double precioduras = duras * 0.6;
        double ganancias = precioduras + preciofrescas;
        System.out.println("Las ganancias del día son de: " + ganancias + "€");
    }
}
