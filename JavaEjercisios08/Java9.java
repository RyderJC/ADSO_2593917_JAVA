import java.util.Scanner;

public class Java9 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese cuantos numeros quiere en el arreglo : ");
        int n = entrada.nextInt();

        int[] arreglo1 = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los numeros "+i+": ");
            arreglo1[i] = entrada.nextInt();
        }

        int[] primos = new int[n];
        int[] noprimos = new int[n];
        int countprimos = 0;
        int countnoprimos = 0;

        for (int i = 0; i < n; i++) {
            if (primo(arreglo1[i])) {
                primos[countprimos] = arreglo1[i];
                countprimos++;
            }else{
                noprimos[countnoprimos] = arreglo1[i];
                countnoprimos++;
            }
        }
        System.out.print("Arreglo Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println("");
        System.out.print("Arreglo Primos: ");
        for (int i = 0; i < countprimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println(" - Longitud: " + countprimos);
        System.out.print("Arreglo No Primos: ");
        for (int i = 0; i < countnoprimos; i++) {
            System.out.print(noprimos[i] + " ");
        }
        System.out.println(" - Longitud: " + countnoprimos);
    }
    public static boolean primo(int num) {
        if (num < 2) {
            return false;
        }
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }
}