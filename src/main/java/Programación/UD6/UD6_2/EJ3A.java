package Programación.UD6.UD6_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EJ3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un numero entero: ");
            int num = sc.nextInt();
            lista.add(num);
        }

        System.out.println("Esta es la Lista introducida" + lista);
        Collections.sort(lista);
        System.out.println("Esta es la lista ordenada: " + lista);


    }
}
