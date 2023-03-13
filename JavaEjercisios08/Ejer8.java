import java.util.Scanner;

public class Ejer8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero del arreglo");
        int n =entrada.nextInt();

        int original [] =new int [n];
        int pares [] =new int [n];
        int impares [] =new int [n];

        for(int i=0;i<original.length;i++){
            original[i]=i;
            if(i%2==0){
                pares[i]=original[i];
            }else if(i%2==1){
                impares[i]=original[i];
            }
        }
        for(int i=0;i<original.length;i++){
            original[i]=i;
            if(i%2==0){
                pares[i]=original[i];
            }else if(i%2==1){
                impares[i]=original[i];
            }
        }
        
        System.out.println("");
        System.out.print("Numero del arreglo: ");
        for(int i=0;i<original.length;i++){
            System.out.print(original[i]);

        }
        System.out.println("");
        System.out.print("Numeros pares: ");
        for(int i=0;i<original.length;i++){
            System.out.print(pares[i]);

        }
        System.out.println("");
        System.out.print("Numero impares: ");
        for(int i=0;i<original.length;i++){
            System.out.print(impares[i]);

        }

    }
}