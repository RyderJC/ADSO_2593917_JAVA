import java.util.Scanner;

public class Java1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);


        System.out.println("Ingrese el tamaño del arreglo ");
        int num = entrada.nextInt();

        int arreglo [] =new int [num];
        int arreglo2 [] = new int [num];
        int arreglo3 [] = new int [num];
        int valor1=0;
        int valor2=0;

        for(int i=0;i<arreglo.lenght;i++){

            System.out.println("Ingrese un numero para el arreglo 1 ");
            valor1=entrada.nextInt();
            System.out.println("Ingrese un numero para el arreglo 2 ");
            valor2=entrada.nextInt();

            arreglo[i]=valor1;
            arreglo2[i]=valor2;

        }

        for(int j=0;j<arreglo.lenght;j++){
            arreglo3[j]=arreglo[j];

            for(int k =1 ; k<arreglo3.lenght;k++){
                arreglo3[k]=arreglo2[k];
            }
        }
        for(int o =1 ; o<arreglo.lenght;o++){
            System.out.print(arreglo3[o]);  
        }
    }
    
}    