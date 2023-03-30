import java.util.Scanner;
public class Ejer4{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese numero maximo de 6 digitos: ");
        int n = entrada.nextInt();

        int original=n;
        int finalista=0;
        int invertido=0;

        while(n != 0){
            finalista=n % 10;
            invertido =(invertido*10)+ finalista;
            n=n/10;
        }
        if(invertido == original){
            System.out.print("El numero ingresado es palindromo: " + invertido);

        }else{
            System.out.print("El numero ingresado NO es palindromo: " + invertido);
        }
    }
}