import java.util.Scanner;
public class Ejer5{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero: ");
        int numero = entrada.nextInt();

        int s=1;
        
        for(int i=1; i<=numero; i++){
            s *=i;
            if(i==numero){
                System.out.print(i + " = ");
            }else{
                System.out.print(i + " X ");
            }
        }
        System.out.print(s);
    }
}