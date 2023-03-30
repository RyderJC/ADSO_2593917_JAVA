import java.util.Scanner;

public class Ciclos8{
    public static void main(String[]args){

       Scanner entrada=new Scanner(System.in);

       System.out.print("Ingrese un numero: ");
       int numero=entrada.nextInt();
       
       //invertir numero
       int invertido=0;

       for(int i=1;i<=6;i++){
           int ultimo=numero%10;
           invertido=(invertido*10)+ultimo;
           numero=numero/10;
           if(numero==0){
                break;
            }
       }
       numero=invertido;
       //Imprimir digitos separados
       for(int i=1;i<=6;i++){
         int num=(numero%10);
         System.out.println("->El digito " +i+ " es: "+numero);
         numero=numero/10;
         if(numero==0){
             break;
            }
        }
    }
}