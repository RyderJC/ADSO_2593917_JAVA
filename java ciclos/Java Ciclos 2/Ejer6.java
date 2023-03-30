import java.util.Scanner;
public class Ejer6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        int i= numero1;
        int n=1;
        while (i<=numero2){
            int j=1;
            while(a<=i){
                n *=a;
                if (a==i){
                    System.out.print(a + "=");
                }else{
                    System.out.print(a + "+");
                }
                if (i==j){
                    System.out.println(n);
                    n=1;
                }
                a++;
            }
            i++;
        }
    }
}