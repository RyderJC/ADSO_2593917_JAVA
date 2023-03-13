import java.util.Scanner;

public class Javaejer3 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print(" Ingrese un nombre : ");
        String nombre = entrada.nextLine();

        int i=0;

        for(i = nombre.length()-1 ; i>= 0;i--){
            System.out.print(nombre.charAt(i));
        }



    }
}    
