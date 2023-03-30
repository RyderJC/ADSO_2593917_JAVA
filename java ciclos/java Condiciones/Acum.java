import java.util.Scanner;

public class Acum{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int cantidad = 10;
        int acumulador = 0;

        for (int i=0; i < cantidad; i++){
            acumulador= acumulador + 5;
            
        }
        int promedio = acumulador / cantidad;
        System.out.println(promedio);
    }
}