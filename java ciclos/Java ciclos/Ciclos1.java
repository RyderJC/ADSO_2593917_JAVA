import java.util.Scanner;

public class Ciclos1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese el numero de notas: ");
        int notas = entrada.nextInt();

        float sumar = 0;
        for ( int i=1; i<=notas; i++ ){
            System.out.print("ingrese la nota "+i+": ");
            float total = entrada.nextFloat();
            sumar = sumar + total;
        }

        float promedio = sumar / notas;
        
        System.out.print("Promedio de notas: " + promedio);
    }
}