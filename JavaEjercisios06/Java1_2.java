import java.util.Scanner;

public class MoverCaracteresIzquierda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        String resultado = moverCaracteresIzquierda(frase, numero);
        System.out.println("Frase movida: " + resultado);
    }

    public static String moverCaracteresIzquierda(String frase, int numero) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            int indiceNuevo = i - numero;
            if (indiceNuevo < 0) {
                indiceNuevo = frase.length() + indiceNuevo;
            }
            char caracter = frase.charAt(i);
            resultado = resultado + frase.charAt(indiceNuevo);
        }
        return resultado;
    }
}
       