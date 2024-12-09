package src.main.java.Programación.UD5.UD5_2.A;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en euros (múltiplo de 5€): ");
        int cantidad = sc.nextInt();

        if (cantidad % 5 != 0) {
            System.out.print("El cantidad debe ser múltiplo de  5");
        }
        else {
            System.out.println("Billetes necesarios: ");
            int billetes500 = cantidad / 500;
            cantidad %= 500;
            int billetes200 = cantidad / 200;
            cantidad %= 200;
            int billetes100 = cantidad / 100;
            cantidad %= 100;
            int billetes50 = cantidad / 50;
            cantidad %= 50;
            int billetes20 = cantidad / 20;
            cantidad %= 20;
            int billetes10 = cantidad / 10;
            cantidad %= 10;
            int billetes5 = cantidad / 5;
            cantidad %= 5;

            if (billetes500 > 0) System.out.println(billetes500 + " billete(s) de 500€");
            if (billetes200 > 0) System.out.println(billetes200 + " billete(s) de 200€");
            if (billetes100 > 0) System.out.println(billetes100 + " billete(s) de 100€");
            if (billetes50 > 0) System.out.println(billetes50 + " billete(s) de 50€");
            if (billetes20 > 0) System.out.println(billetes20 + " billete(s) de 20€");
            if (billetes10 > 0) System.out.println(billetes10 + " billete(s) de 10€");
            if (billetes5 > 0) System.out.println(billetes5 + " billete(s) de 5€");

        }
    }
}
