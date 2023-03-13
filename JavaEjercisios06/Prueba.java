import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar al usuario dos números que indicarán el tamaño de los arreglos.
        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int tamano1 = scanner.nextInt();
        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int tamano2 = scanner.nextInt();

        // Paso 2: Crear dos arreglos con el tamaño indicado por el usuario.
        int[] arreglo1 = new int[tamano1];
        int[] arreglo2 = new int[tamano2];

        // Paso 3: Solicitar al usuario los valores para llenar cada uno de los arreglos.
        System.out.println("Ingrese los valores para el primer arreglo:");
        for (int i = 0; i < tamano1; i++) {
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los valores para el segundo arreglo:");
        for (int i = 0; i < tamano2; i++) {
            arreglo2[i] = scanner.nextInt();
        }

        // Paso 4: Crear un tercer arreglo con tamaño igual a la suma de los tamaños de los dos primeros arreglos.
        int tamano3 = tamano1 + tamano2;
        int[] arreglo3 = new int[tamano3];

        // Paso 5: Recorrer ambos arreglos de manera intercalada y agregar los elementos al tercer arreglo.
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < tamano3; i++) {
            if (i % 2 == 0 && index1 < tamano1) {
                arreglo3[i] = arreglo1[index1];
                index1++;
            }else if (index2 < tamano2) {
                arreglo3[i] = arreglo2[index2];
                index2++;
            }
        }

        // Paso 6: Mostrar en pantalla el tercer arreglo.
        System.out.print("El tercer arreglo es: { ");
        for (int i = 0; i < tamano3; i++) {
            System.out.print(arreglo3[i]);
            if (i < tamano3 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}

