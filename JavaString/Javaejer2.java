import java.util.Scanner;

public class Javaejer1 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print(" Ingrese una oracion : ");
        String invertir = entrada.nextLine();

        for(int i=0;i<invertir.length();i++){

            int pos =(int) invertir.charAt(i);

            if(pos >= 65 && pos <= 90 ){
                char nuevo = (char) (pos+32);
                System.out.print(nuevo);
            }else if (pos >= 97 && pos <= 120 ){
                char nuevo = (char) (pos-32);
                System.out.print(nuevo);
            }else if (pos == 32){
                char nuevo =(char) (pos=32);
                System.out.print(nuevo);
            }
        }
    }
}    