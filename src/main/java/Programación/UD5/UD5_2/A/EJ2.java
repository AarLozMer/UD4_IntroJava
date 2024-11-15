package Programación.UD5.UD5_2.A;

public class EJ2 {
    public static void main(String[] args) {
        int cont = 1;
        int max = 200;

       while (cont <= max){
           if (cont % 2 == 0) {
               System.out.println(cont);
               cont = cont + 2;
           }
           else {
               cont++;
           }
       }



    }
}
