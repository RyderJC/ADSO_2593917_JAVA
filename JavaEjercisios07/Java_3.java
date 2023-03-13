import java.util.Scanner;

public class Java_3 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.printl("Ingrese un numero ");
        int num = entrada.nextInt();
    
        int arreglo [] = new int [num]
        int aux =0;



        for (int i=0 ; i < arreglo.length;i++) {
            int aleatorio = (int)(Math.random()*1000);
            arreglo[i]=aleatorio;

        }

        for (int j=0 ; j < arreglo.length;j++){
            for (int k=0 ; k < arreglo.length;k++){
                if(arreglo[k]>arreglo[k+1]){
                    aux=arreglo[k];
                    arreglo[k]=arreglo[k+1];
                    arreglo[k+1]=aux;
                }

            }

        }

        for (int p=0 ; p < arreglo.length;p++){
            System.out.printl("Estos son los numeros impares :"+arreglo[p]);
        }

    }        

}    