import java.util.Scanner;
public class E4{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        String ciudad;
        System.out.println ("=>Estimad@ usuario ingrese la ciudad origen: ");
        ciudad=texto.nextLine();

        System.out.println("Usuario ingrese la cantidad de paradas: ");
        int cant_paradas = entrada.nextInt();

        double acum_kilo=0;
        
        for(int i=1; i<=cant_paradas; i++){
            String paradas;
            System.out.println("Usuario ingrese las ciudad No "+i+" que corresponde la parada: ");
            paradas = texto.nextLine();

            System.out.println("Ingrese los kilometros que recorrio en la parada No "+i+":" );
            double parada_kilo = entrada.nextDouble();
            acum_kilo=acum_kilo+parada_kilo;
        }

        System.out.println ("Esta es la ciudad donde empezo: " + ciudad);
        System.out.println ("Este es el total de kilometros que se recorrio: " + acum_kilo);

        System.out.println ("Ingrese los litros con que relleno el auto: ");
        int litro_gaso = entrada.nextInt();
        System.out.println ("Ingrese el valor de la gasolina por litro: ");
        int valor_gaso = entrada.nextInt();


        double litros=(litro_gaso/acum_kilo)*100;
        double por_litro=acum_kilo/litro_gaso;
        int precio=litro_gaso*valor_gaso;

        System.out.println ("Estos son los litros que se gasto en el recorrido: " + litros);
        System.out.println ("Estos son los km que habrias recorrido por litro: " + por_litro);
        System.out.println ("Este es el valor total de la gasolina: " + precio);
    }
}