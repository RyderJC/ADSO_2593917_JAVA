import java.util.Scanner;
public class Ciclos7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero: ");
        int n1 = entrada.nextInt();

        System.out.print("--> Ingrese un numero: ");
        int n2 = entrada.nextInt();

        System.out.print("--> Ingrese un numero: ");
        int n3 = entrada.nextInt();
    
        int cont=1;
        boolean buscando = true;

        while(buscando){
            if(cont%n1==0 && cont%n2==0 && cont%n3==0){
                buscando = false;
            }else{
                cont++;
            }
        }
        System.out.println("MCM es: " + cont);
    }
}
