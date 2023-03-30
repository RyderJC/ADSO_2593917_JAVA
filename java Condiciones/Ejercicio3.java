import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de X");
        int valor_x = entrada.nextInt();

         System.out.println("Ingrese el valor de Y");
        int valor_y = entrada.nextInt();

        if (valor_x >= 0 & valor_y >= 0){
            System.out.println("Usted esta en el cuadrante 1");

        }else if(valor_x <= 0 & valor_y >= 0){
            System.out.println("Usted esta en el cuadrante 2");

        }else if(valor_x <= 0 & valor_y <= 0){
            System.out.println("Usted esta en el cuadrante 3");
            
        }else if(valor_x >= 0 & valor_y <= 0){
            System.out.println("Usted esta en el cuadrante 4");
        }
    }
}