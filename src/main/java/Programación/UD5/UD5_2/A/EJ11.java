package Programación.UD5.UD5_2.A;

public class EJ11 {
    public static void main(String[] args) {
        int acumpar = 0;
        int acumimpar = 0;
        int n = 200;

        for (int i = 100; i <= n; i++) {
            if (i % 2 == 0) {
                acumpar = acumpar + i;
            } else {
                acumimpar = acumimpar + i;
            }
        }
        System.out.print("Este es la suma de los pares: " + acumpar + " y esta es la suma de los impares: " + acumimpar);
    }
}
