import java.util.Scanner;
public class Ejem1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
	    
	    int arreglo1 [] =  new int [5];
	    
	    for(int i=0; i<arreglo1.length; i++){
	        arreglo1[i] = (i+1)*2;
	    }

	    //imprimir arreglo
	    for(int i=0; i<arreglo1.length; i++){
	        System.out.print("["+arreglo1[i]+"]");
        }
		
    }
}