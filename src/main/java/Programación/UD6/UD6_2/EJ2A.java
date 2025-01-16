package Programación.UD6.UD6_2;

import java.util.*;
import java.util.Collections;

public class EJ2A {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numeros = new ArrayList<>();
            int count, numero, suma = 0;



        Random r = new Random();
        int random = (int) (Math.random()*(10)+20);
            for (count = 0; count < random; count++) {
                numero = (int) (Math.random()*(100));
                numeros.add(numero);
                suma += numero;




                count ++;

            }
            int max = Collections.max(numeros);
            int min = Collections.min(numeros);
            double media = (double) suma/numeros.size();

            System.out.println("Lista generada: "+ numeros.toString());
            System.out.println("La suma total es : " + suma);
            System.out.println("La media : " + media);
            System.out.println("El minimo es : " + min );
            System.out.println("El maximo es : " + max );

    }
}
