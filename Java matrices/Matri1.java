import java.util.Scanner;
public class Matri1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        

        System.out.println("Usuario ingrese el numero de filas:");
	    int filas = entrada.nextInt();

        System.out.println("Usuario ingrese el numero de columnas:");
        int col = entrada.nextInt();

        int matriz [][] =  new int [filas][col];
	    
	    for(int i=0; i<filas; i++){

            for(int j=0; j<col; j++){

                System.out.print("Ingrese el valor de la fila "+i+" de la columna "+j+" : ");
                matriz[i][j]=entrada.nextInt();

            }
        }

        System.out.println("-->Estos son los valores que usted ingreso: ");

        for(int i=0; i<filas; i++){
            for(int j=0; j<col; j++){

                System.out.print("["+matriz[i][j]+"]");

            }
        }
    }
}