import java.util.Scanner;

public class Javastring {

    public static void main(String [] args){
        //varibale para leer datos
        Scanner entrada = new Scanner (System.in);

        //Pedir texto al usuario
        System.out.print("Ingrese el nombre");
        String cadenas = entrada.nextLine();

        Pruebas 
        System.out.println(" Valor almacenado =>  "+cadenas);
        System.out.println(" Cantidad letras =>  "+cadenas.length());
        System.out.println(" Letra en pos 0 =>  "+cadenas.charAt(0));
        System.out.println(" Letra en pos 1 =>  "+cadenas.charAt(1));
        System.out.println(" Letra en pos 2 =>  "+cadenas.charAt(2));
        System.out.println(" Letra en pos 3 =>  "+cadenas.charAt(3));
        

        String palabra1 = "Hola";
        String palabra2 = "hola";
        
        System.out.println(" CompareTo P1 a P2 :" +  palabra1.compareTo(palabra2));
        System.out.println(" CompareTo P2 a P1 :" +  palabra2.compareTo(palabra1));
        
        //compara frases importando las mayusculas y minusculas
        System.out.println(" Equeals P1 a P2 :" +  palabra1.equals(palabra2));
        System.out.println("  Equals P2 a P1 :" +  palabra2.equals(palabra1));

        //compara frases sin importar las mayusculas y minusculas 
        System.out.println(" Equeals P1 a P2 :" +  palabra1.equalsIgnoreCase(palabra2));
        System.out.println(" Equals P2 a P1 :" +  palabra2.equalsIgnoreCase(palabra1));

    }
}  
