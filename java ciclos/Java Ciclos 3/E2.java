import java.util.Scanner;
public class E2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println ("=>Estimad@ usuario ingrese la cantidad total financiada: ");
        int cant_total = entrada.nextInt();

        System.out.println("Ingrese la cantidad de cuotas pagadas: ");
        int cuotas_pagadas = entrada.nextInt();

        System.out.println("Ingrese el valor de cada cuota: ");
        int v_cuotas = entrada.nextInt();

        float por=v_cuotas*100/cant_total;

        System.out.println("-->Este es el porcentaje total del interes pagado: " + por+"%");

        int finansa=cuotas_pagadas*v_cuotas;
        int costo_f=finansa+cant_total;

        System.out.println("-->Este es el interes total de la entidad financiera: " + costo_f);
    }
}