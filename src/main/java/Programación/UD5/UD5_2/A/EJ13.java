package Programación.UD5.UD5_2.A;


import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_menor = 1;
        int num_mayor = 100;
        int num_pensado = 0;
        String respuesta;
        System.out.print("Piensa un numero: ");
        int num = sc.nextInt();

        while (num_pensado != num) {
            num_pensado = (num_menor + num_mayor)/2;
            if (num_pensado != num) {
                System.out.print("¿Tu número es: " + num_pensado + "?");
                respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("Mayor")) {
                    num_menor = num_pensado;
                } else if (respuesta.equalsIgnoreCase("Menor")) {
                    num_mayor = num_pensado;
                }
            }
        }
        System.out.println("¡Tú número es  "+ num_pensado + "!");
    }
}