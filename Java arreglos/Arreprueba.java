import java.util.Scanner;
public class Arre2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
	    
	    int arreglo_1 [] =  new int [10];

        
	    
	    for(int i=0; i<=9; i++){
	        System.out.println("Usuario ingrese su edad: ");
	        int e = entrada.nextInt();
	        arreglo_1[i]= e;
            System.out.println("-->Usuario No "+i+" esta es su edad: " + e);
	    }

        arreglo_1[0]=25;
        arreglo_1[3]=55;
        arreglo_1[9]=99;

	    System.out.println("Estas son las edades ingresadas: ");

	    for(int i=0; i<=9; i++){
            
	        System.out.print("["+arreglo_1[i]+"]");
        }
    }
}