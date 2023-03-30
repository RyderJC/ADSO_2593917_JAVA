import java.util.Scanner;
public class Ejer7{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero:");
        int numero = entrada.nextInt();

        for (int i=0; i<=numero; i++) {
            for (int a=numero-i; a>0; a--) {
                System.out.print(" ");
            }
            for (int a=0; a<i;a++) {
                System.out.print(" x");
            }
            System.out.println("");
        }

        for (int i=0; i<=numero; i++) {
            for (int a=0; a<=i; a++) {
                System.out.print(" ");
            }
            for (int a=numero-i-1; a>0; a--) {
                System.out.print(" x");
            }
            System.out.println("");
        }
    }
}