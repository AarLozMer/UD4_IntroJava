package Programación.UD5;
import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args) {

    //Declaramos la variable num
    int num;

    //Creamos el objeto Scanner para leer por teclado
    Scanner reader = new Scanner(System.in);

    //Pedimos y leemos X
    System.out.print("Introduce un nº: ");
    num = reader.nextInt();

    // Estructura alternatuva doble
    if (num >= 0)
        System.out.println("Número positivo");
    else
        System.out.println("Número negativo");
    }

}
