import java.util.Scanner;

public class Prueba4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario el tamaño del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamArreglo = input.nextInt();

        // Crear el arreglo con el tamaño indicado y llenarlo con valores aleatorios entre 1 y 100
        int[] arreglo = new int[tamArreglo];
        System.out.println("Ingresa los valores del arreglo:");
        for (int i = 0; i < tamArreglo; i++) {
            arreglo[i] = input.nextInt();
        }

        // Crear los arreglos para números primos y no primos
        int[] primos = new int[tamArreglo];
        int[] noPrimos = new int[tamArreglo];
        int indicePrimos = 0;
        int indiceNoPrimos = 0;

        // Separar los números primos y no primos del arreglo original
        for (int i = 0; i < tamArreglo; i++) {
            if (esPrimo(arreglo[i])) {
                primos[indicePrimos] = arreglo[i];
                indicePrimos++;
            } else {
                noPrimos[indiceNoPrimos] = arreglo[i];
                indiceNoPrimos++;
            }
        }

        // Mostrar los 3 arreglos y su longitud
        System.out.print("Arreglo original: ");
        mostrarArreglo(arreglo);
        System.out.print("Arreglo de primos: ");
        mostrarArreglo(primos);
        System.out.print("Arreglo de no primos: ");
        mostrarArreglo(noPrimos);

        System.out.println("Longitud del arreglo original: " + tamArreglo);
        System.out.println("Longitud del arreglo de primos: " + indicePrimos);
        System.out.println("Longitud del arreglo de no primos: " + indiceNoPrimos);
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Función para mostrar un arreglo en pantalla
    public static void mostrarArreglo(int[] arreglo) {
        System.out.print("{ ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}

