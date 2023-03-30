import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero de 6 digitos: ");
        int numero = entrada.nextInt();

        System.out.println("Menu: 1.Primer Digito. 2.Segundo Digito. 3.Tercer Digito. 4.Cuarto Digito. 5 Quinto Digito. 6.Sexto Digito." );
        System.out.println("");
        System.out.println("Ingrese algun numero del Menu: ");
        int digito = entrada.nextInt();

        if (digito == 1){
            int resultado = (numero % 10);
            System.out.println("Este es el primer digito: " + resultado);

        } else if (digito == 2){
            int resultado2 = (numero/10 % 10);
            System.out.println("Este es el segundor digito: " + resultado2);

        }else if (digito == 3){
            int resultado3 = (numero/10/10 % 10);
            System.out.println("Este es el tercer digito: " + resultado3);

        }else if (digito == 4){
            int resultado4 = (numero/10/10/10 % 10);
            System.out.println("Este es el cuarto digito: " + resultado4);

        }else if (digito == 5){
            int resultado5 = (numero/10/10/10/10 % 10);
            System.out.println("Este es el quinto digito: " + resultado5);

        }else if (digito == 6){
            int resultado6 = (numero/10/10/10/10/10 % 10);
            System.out.println("Este es el sesto digito: " + resultado6);

        }else if (digito == 7);{
            System.out.println("Solo eran seis(6) digitos ");
        }
    }
}