import java.util.Scanner;


public class Ejercicio4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int n1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        int n2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero");
        int n3 = entrada.nextInt();

        if(n1>n2 & n3<n2 & n2<n1){
            System.out.println("Este es su numero mayor: " + n1);
            System.out.println("Este es su numero menor: " + n3);

        } else if(n1<n2 & n2>n3 & n1<n3 ){
            System.out.println("Este es su numero mayor: " + n2);
            System.out.println("Este es su numero menor: " + n1);

        } else if(n1<n2 & n2<n3 & n3>n1 ){
            System.out.println("Este es su numero mayor: " + n3);
            System.out.println("Este es su numero menor: " + n1);

        } else if(n2<n1 & n3>n2 & n1>n3 ){
            System.out.println("Este es su numero mayor: " + n1);
            System.out.println("Este es su numero menor: " + n2);

        } else if(n1<n2 & n2>n3 & n1>n3 ){
            System.out.println("Este es su numero mayor: " + n2);
            System.out.println("Este es su numero menor: " + n3);

        } else if(n2<n1 & n3>n2 & n3>n1 ){
            System.out.println("Este es su numero mayor: " + n3);
            System.out.println("Este es su numero menor: " + n2);
    
        } else if(n1>n2 & n2<n3 & n3>n1){
            System.out.println("Este es su numero mayor: " + n1);
            System.out.println("Este es su numero menor: " + n2);
        }
    }
}