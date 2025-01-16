package Programación.UD6.UD6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contactos = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("\nAgenda de Contactos: ");
            System.out.println("1. Añadir Contacto");
            System.out.println("2. Ver Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    contactos.add(sc.next());
                    System.out.println("Ingresa el numero (formato 678903310): ");
                    numeros.add(sc.next());
                    System.out.println("Contacto añadido");
                break;
                case 2:
                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.print("Nombre: " + contactos.get(i) + ", Telefono: " + numeros.get(i));

                    }

                    break;
                case 3:
                    System.out.print("Introduce (1) para buscar por nombre, o (2) para buscar por telefono ");




            }
        } while (opcion != 6);

    }
}
