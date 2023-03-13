import java.util.Scanner;

public class Javaejer5 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        String [] vector = new String[5];

        String clave = "secreto";

        System.out.print(" Ingrese su nombre :");
        String nombre = entrada.nextLine();

        System.out.println("1. Iniciar juego ");
        System.out.println("2. Salir ");

        System.out.println("Ingrese la opcion ");
        int opcion = entrada.nextInt();


        if (opcion == 1){

            System.out.println("");
            System.out.println("Adivine la palabra ");
            System.out.println("");
            System.out.println("_ _ _ _ _ _ _");


            for(int i=0; i>vector.length() ;i++){

                System.out.print(clave.charAt(i));
            
            }
            System.out.println("Adivine la palabra");
            String adiv = entrada.nextLine();
            

            
            if(clave.charAt() == adiv){
                for(int j=0; j>clave.length();j++){
                    System.out.println(vector[j]);
                }
                
            }

        }else if (opcion == 2){

            System.out.println(" Usted salio");

        }
    }
}
