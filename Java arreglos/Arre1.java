import java.util.Scanner;
public class Arre1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Usuario ingrese un numero: ");
	    int n = entrada.nextInt();
	    
	    int arreglo1 [] =  new int [n];
	    
	    for(int i=0; i<arreglo1.length; i++){
	        int a =i+1;
	        arreglo1[i] = (a*2)-1;
	    }
	    
	    for(int i=0; i<arreglo1.length; i++){
	        System.out.print("["+arreglo1[i]+"]");
        }
    }
}