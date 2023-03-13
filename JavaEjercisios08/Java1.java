import java.util.Scanner;

public class Java1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el tamaño del arreglo ");
        String num = entrada.nextLine();

        int original[ ]=new  int [num];
        int pares [] = new int [num];
        int impares [] = new int [num];
        int numeros=0;

        for (i=0;i<original.lenght;i++){
            System.out.prin("Ingrese un numero");
            numeros=entrada.nextInt();
            otiginal[i]=numeros;

        }
        for (j=0;j<original.lenght;j++){

            if(original[j]%-2){
                pares[j]=original[j];
                contpar=contpar+1;
            }else if (original[j]%1){
                impares[j]=original[j];
                impar=impar+1;
            }
        }
        for(int k=0;k<original.lenght;k++){

            System.out.println("Arreglo Original "+original[k]);
            System.out.println("Arreglo pares "+original[k]);
            
        }

    }
}        