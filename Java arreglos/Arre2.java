import java.util.Scanner;
public class Arre2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Ingrese numero N: ");
        int n = entrada.nextInt();
        int numero [] =  new int [n];
        int i=0;
        while (i<n){
            int aleatorio = (int)(Math.random()*1000);
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int a=1;
            while (a<=aleatorio){           
                if (aleatorio%a==0){
                    acumulador++;
                }
                a++;
            }
            if (acumulador==2){
                boolean valido=true;
                for (int j=0; j<n; j++){
                    if (numero[j] == aleatorio){
                        valido=false;
                    }
                    
                }
                if (valido){
                    numero[i]=aleatorio;
                    i++;
                }
            }
        }
        System.out.println("-->Estos son los numeros primos:");
        for (i=0; i<n; i++){
            System.out.print("["+numero[i]+"]");
        }
	}
}