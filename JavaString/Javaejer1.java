import java.util.Scanner;

public class Javaejer1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print(" Ingrese una oracion : ");
        String cadenas = entrada.nextLine();

        int acum =0;
        
        for( int i =0; i < cadenas.length();i++){

            if(cadenas.charAt(i) =='a' || cadenas.charAt(i) =='e' || cadenas.charAt(i) =='i' || cadenas.charAt(i) =='o' || cadenas.charAt(i) =='u'){
            acum=acum+1;

            }else{
                if(cadenas.charAt(i) =='A' || cadenas.charAt(i) =='E' || cadenas.charAt(i) =='I' || cadenas.charAt(i) =='O' || cadenas.charAt(i) =='U'){
                    acum=acum+1;
                }
                
            }
        }
        System.out.println("Estas son las letras vocales "+acum);
    }
}    