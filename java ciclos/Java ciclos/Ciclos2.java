import java.util.Scanner;

public class Ciclos2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" => Ingrese la cantidad de materias: ");
        int materias = entrada.nextInt();

        float notas = 0;
        int credito = 0;

        for ( int i=1; i<=materias; i++ ){
            System.out.print("ingrese la nota de la materia "+i+": ");
            float calificacion = entrada.nextFloat();
            notas = notas + calificacion;

            System.out.print("ingrese el credito de la materia "+i+": ");
            int pago = entrada.nextInt();
            credito = credito + pago;
        }

        float promedio = notas / materias;


        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Suma de los creditos: " + credito);
    }
}