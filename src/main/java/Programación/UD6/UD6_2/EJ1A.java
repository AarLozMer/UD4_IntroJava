package Programación.UD6.UD6_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EJ1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> clase = new ArrayList<>();
        clase.add("Josemi");
        clase.add("Dawid");
        clase.add("Manuel");
        clase.add("Yago");
        clase.add("Jota");
        clase.add("Toni");

        Iterator<String> it = clase.iterator();
        for (int i = 0; i < 6; i++) {
            System.out.print(it.next() + " ");
        }

    }
}
