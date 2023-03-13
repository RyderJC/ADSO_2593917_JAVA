import java.util.Scanner;

public class Java_1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese un numero ");
        int num = entrada.nextInt();

        int arreglo [] = new int [num];


        for (int i=0 ; i < arreglo.length;i++) {
            
            arreglo[i]=(i+1)*2-1;
        }

        for (int j=0 ; j < arreglo.length;j++){

            System.out.println("Estos son los numeros impares"+arreglo[j]);
        }

    }
}    