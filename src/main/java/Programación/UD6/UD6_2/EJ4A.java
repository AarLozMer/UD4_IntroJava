package Programación.UD6.UD6_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EJ4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introduzca 10 palabras: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Lleva " + i + " palabras");
            String palabras = sc.nextLine();
            lista.add(palabras + "");
        }
        System.out.println("Esta es la lista introducida: " + lista);
        Collections.sort(lista);
        System.out.println("Y esta es la lista ordenada: " + lista);

    }
}
