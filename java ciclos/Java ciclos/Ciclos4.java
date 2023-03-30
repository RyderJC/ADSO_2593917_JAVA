import java.util.Scanner;

public class Ciclos4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n=999999;
        int i = 1;
        while(i < n){

            System.out.println("");
            System.out.println("|------------- Bienvenido ------------|");
            System.out.println("| 1. Docente                          |");
            System.out.println("| 2. Estudiante                       |");
            System.out.println("| 3. Salir                            |");
            System.out.println("|-------------------------------------|");
            System.out.println("");
            System.out.println("ingrese alguna de las opciones");
            int opcion = entrada.nextInt();

       

            if (opcion == 1){
             System.out.print(" => Ingrese el numero de notas: ");
            int notas = entrada.nextInt();

            float sumar = 0;
            for ( int a=1; a<=notas; a++ ){
             System.out.print("ingrese la nota "+a+": ");
                float total = entrada.nextFloat();
                sumar = sumar + total;
            }

            float promedio = sumar / notas;
        
            System.out.print("Promedio de notas: " + promedio);
            n=2;
            }


            if (opcion == 2) {
                System.out.print(" => Ingrese la cantidad de materias: ");
            int materias = entrada.nextInt();

            float notas = 0;
            int credito = 0;

            for ( int b=1; b<=materias; b++ ){
                System.out.print("ingrese la nota de la materia "+b+": ");
             float calificacion = entrada.nextFloat();
                notas = notas + calificacion;

                System.out.print("ingrese el credito de la materia "+b+": ");
                int pago = entrada.nextInt();
                credito = credito + pago;
                n=2;
            }

            float promedio = notas / materias;

            System.out.println("Promedio de notas: " + promedio);
            System.out.println("Suma de los creditos: " + credito);
            }


            if (opcion ==3){
                System.out.println("Gracias por participar");
                n=0;
            }

            if (opcion < 0 | opcion>4){
                System.out.println("Error en el ingreso de datos");
                n=2;
            }
        }
    }
}