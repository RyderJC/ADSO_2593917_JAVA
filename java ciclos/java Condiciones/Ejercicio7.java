import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int resultado = (numero % 10);
        int resultado2 = (numero/10)%10;
        int resultado3 = (numero/10/10)%10;
        int resultado4 = (numero/10/10/10)%10;
        int resultado5 = (numero/10/10/10/10)%10;
        int resultado6 = (numero/10/10/10/10/10)%10;
        int resultado7 = (numero/10/10/10/10/10/10)%10;
        int resultado8 = (numero/10/10/10/10/10/10/10)%10;
        int resultado9 = (numero/10/10/10/10/10/10/10/10)%10;
        int resultado10 = (numero/10/10/10/10/10/10/10/10/10);

        if (resultado10>=0 & resultado9>=0 & resultado8>=0 & resultado7>=0 & resultado6>=0 & resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado10 + "." + resultado9 + resultado8 + resultado7 + "." + resultado6 + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado9>=0 & resultado8>=0 & resultado7>=0 & resultado6>=0 & resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado9 + resultado8 + resultado7 + "." + resultado6 + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado8>=0 & resultado7>=0 & resultado6>=0 & resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado8 + resultado7 + "." + resultado6 + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado7>=0 & resultado6>=0 & resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado7 + "." + resultado6 + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado6>=0 & resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado6 + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado5>=0 & resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado5 + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado4>=0 & resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado4 + "." + resultado3 + resultado2 + resultado);
        }else if (resultado3>=0 & resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado3 + resultado2 + resultado);
        }else if (resultado2>=0 & resultado>=0) {
            System.out.println("$" + resultado2 + resultado);
        }else if (resultado>=0) {
            System.out.println("$" + resultado);
        }
    }
}



