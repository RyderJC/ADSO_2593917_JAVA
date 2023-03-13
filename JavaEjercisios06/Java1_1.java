import java.util.Scanner;

public class Java1_1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la contraseña: ");
        String oracion = entrada.nextLine();

        int contador=0;
        int posicion=0;

        for (int i=0; oracion.length();i++) {
            if(posicion>=65 && posicion <=90){

            }else{
                contador=contador+1;
            }
            if(posicion>=97 && posicion <=122){

            }else{
                contador=contador+1;
            }
            if(posicion>=48 && posicion <=57){

            }else{
                contador=contador+1;
            }
            if(posicion>=33 && posicion <=46){

            }else{
                contador=contador+1;
            }
        }

        if(contador>1){
            System.out.println("La contraseña es invalida");
        }else{
            System.out.println("La contraseña es valida");
        }
    }
}       