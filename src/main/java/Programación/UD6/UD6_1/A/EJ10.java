package Programación.UD6.UD6_1.A;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String metros = "metros";
        System.out.print("Introduce el número de personas: ");
        int n = sc.nextInt();
        double altura[] = new double[n];
        double max = 0;
        double min = 0;
        double acum = 0;
        double cont= 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura en metros de las personas: ");
            altura[i] = sc.nextDouble();
            acum += altura[i];
            if(i == 0){
                max = altura[i];
                min = altura[i];
            }
            if (altura[i] > max) {
                max = altura[i];
            } else if (altura[i] < min) {
                min = altura[i];
            }
            cont++;

        }
        double media = acum / cont;
        System.out.print("Esta es la altura más grande: " + max + " esta es la más pequeña: " + min);
        System.out.print("Esta es la media: " + media );
    }
}
