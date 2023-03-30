import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
         
         
        Scanner entrada = new Scanner(System.in);

        int auxilio1 = 800000;
        int auxilio2 = 200000;

        System.out.println("Buen dia senor usuario, por favor ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad<18) {
          System.out.println("Usted recibe este auxilio monetario:" + auxilio1);
          
        } else {
            System.out.println("Usted debe pagar este impuesto:" + auxilio2);  
        }
    }
}