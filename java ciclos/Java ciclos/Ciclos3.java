import java.util.Scanner;

public class Ciclos3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese un numero de altura de la piramide (Ejemplo: 1), (Ejemplo: 2), (Ejemplo: 3): ");
        int numero = entrada.nextInt();


        for ( int i=1; i<=numero; i++ ){
            int doblar=(2*i)-1;
            int n=numero - i;
            for (int a=0; a<=n; a++){
                System.out.print(" ");
            }

            for (int j=0; j<doblar; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        
    }
}