import java.util.Scanner;

public class Java_5 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamano = entrada.nextInt();

        String nombres [] = new String [tamano];
        String generos [] = new String [tamano];
        
        int aux=0;

        for (int i =0 ; i<tamano;i++){
            System.out.println("Ingrese su Nombre ");
            String nombre= entrada.nextLine();
            nombres[i]=nombre;

            System.out.println("Ingrese su Genero ");
            String genero= entrada.nextLine();
            generos[i]=genero;
        }
        for(int i =0;i<tamano;i++){
            System.out.println("["+nombres[i]+"-->"+generos[i]+"]");
        }
    }
}            