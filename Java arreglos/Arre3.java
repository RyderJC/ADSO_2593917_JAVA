import java.util.Scanner;
public class Arre3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Usuario ingrese el limite del vector: ");
	    int n = entrada.nextInt();
	    
	    int arreglo1 [] =  new int [n];
	    
	    for(int i=0; i<arreglo1.length; i++){

	        arreglo1[i] = i+1;
	    }
	    for(int i=0; i<arreglo1.length; i++){
	        System.out.print("["+arreglo1[i]+"]");
        }

        System.out.print("Usuario ingrese el numero de la posicion: ");
	    int posicion = entrada.nextInt();

    }
}