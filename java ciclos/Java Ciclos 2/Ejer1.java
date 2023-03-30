import java.util.Scanner;
public class Ejer1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("--> Ingrese un numero de 1 a 6: ");
        int numero = entrada.nextInt();

        int acum=0;
        int elab = 0;
        int total = 0;
        int aleatorio = 0;
        for(int i=1; i<=numero; i++){

          aleatorio = (int)(Math.random() * 10);
          total=(total*10)+aleatorio;
        
            

        }
        System.out.print("");
        System.out.println( "Este es el numero aleatorio:" + total);
        System.out.print("");
        elab = total*2;
        System.out.print("Resultado multiplicado:" + elab);



    }
}