package Programación.UD4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int cont = 10;
        int limite = 20;

        boolean resultado;

        resultado = (cont == 0) && (limite < 20);
                System.out.println(resultado);
        resultado = (limite >= 20) || (cont <5);
                System.out.println(resultado);
        //resultado = ((limite / (cont - 10)) > 7) || (limite < 20);
                //System.out.println(resultado);//
        resultado = (limite <= 20) || ((limite / (cont - 10)) > 7);
                System.out.println(resultado);
        //resultado = ((limite / (cont - 10)) > 7) && (limite < 0);
                //System.out.println(resultado);
        resultado = (limite < 0) && ((limite / (cont - 10)) > 7);
                System.out.println(resultado);

    }
}
