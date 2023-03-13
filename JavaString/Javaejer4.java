import java.util.Scanner;

public class Javaejer4 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print(" Ingrese una palabra :");
        String palabra = entrada.nextLine();

        char [] palindromo;

        int izq, der;

        palindromo = palabra.toCharArray();

        izq = 0;
        der = palindromo.length-1;

        while(izq != der){
            if(palindromo[izq] == palindromo [der]){
                der--;
                izq++;
            }else{
                System.out.println("La palabra "+palabra+" No es un palindromo");
                break;
            }
        }
        if (izq == der ){
            System.out.println("La palabra "+palabra+" Si es un palindromo");
        }
    }
}  