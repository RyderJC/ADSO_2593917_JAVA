import java.util.Scanner;

public class Ciclos5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero: ");
        int numero = entrada.nextInt();

        int s=0;
        int n1=1;
        int n2;

        for(int i=1; i<=numero; i++){
            n2 = s;
            s = n1 + s;
            n1 = n2;
           System.out.println(n1);
            
        }
    }
}