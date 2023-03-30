import java.util.Scanner;
public class E3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println ("=>Estimad@ usuario ingrese el valor total de la finanza: ");
        int v_total = entrada.nextInt();

        System.out.println("Ingrese la cantidad de cuotas: ");
        int cant_cuotas = entrada.nextInt();

        System.out.println("Ingrese la tasa de interes en porcentaje(%): ");
        int tasa_int = entrada.nextInt();

        int costo_f=v_total*tasa_int/100;

        int capital=v_total/cant_cuotas;

        int valor_cuota= costo_f+capital;

        int cost_total=costo_f*cant_cuotas;
        int deuda_total= v_total+cost_total;

        System.out.println("-->Este es el el valor del interes: $" + costo_f);
        System.out.println("-->Este es el el valor del abono a capital: $" + capital);
        System.out.println("-->Este es el el valor de la cuota: $" + valor_cuota);
        System.out.println("-->Este es el el valor de la deuda total: $" + deuda_total);
    }
}