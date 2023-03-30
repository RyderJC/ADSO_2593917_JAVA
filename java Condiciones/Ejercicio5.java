import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int n1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        int n2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero");
        int n3 = entrada.nextInt();

        if (n1<n2 & n2<n3 & n3>n1){
            System.out.println("los ingreso de manera ascendente ");

        } else if (n1>n2 & n2>n3 & n3<n1){
            System.out.println("los ingreso de manera descendente ");

        } else if (n1>n2 & n2>n3 & n3<n1){
            System.out.println("los ingreso de manera desordenada ");

        }else if (n1>n2 & n2>n3 & n3>n1){
            System.out.println("los ingreso de manera desordenada ");

        }else if (n1<n2 & n2>n3 & n3>n1){
            System.out.println("los ingreso de manera desordenada ");

        } else if (n1>n2 & n2<n3 & n3>n1){
            System.out.println("los ingreso de manera desordenada ");

        } else if (n1>n2 & n2<n3 & n3>n1){
            System.out.println("los ingreso de manera desordenada ");

        } else if (n1<n2 & n2>n3 & n3<n1){
            System.out.println("los ingreso de manera desordenada ");

        }else if (n1>n2 & n2<n3 & n3<n1){
            System.out.println("los ingreso de manera desordenada ");
        }
    }
}