import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Buen dia usuario, ingrese un numero de 3 digitos: ");
        int numero = entrada.nextInt();
        int resultado = (numero % 2);

        if (resultado == 0){
            System.out.println("Su numero es par");
        }
         else if (resultado != 0){
            System.out.println("Su numero es impar");
        }
    }
}