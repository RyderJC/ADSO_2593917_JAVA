import java.util.Scanner;

public class Ejer2{
    public static void main(String[]args){

    Scanner entrada=new Scanner(System.in);
    int dias=(int)(Math.random()*31);
    if(dias<31){
        System.out.print(dias);
    }
    boolean buscando=true;
    while(buscando==true){
        int meses=(int)(Math.random()*12);
        if(meses<=12){
            System.out.print("0"+meses);
            buscando=false;
        }
    }
    boolean buscar=true;
    while(buscar==true){
        int anos=(int)(Math.random()*9000);
        if(anos>=1000 && anos<=9000){
            System.out.print(anos);
            buscar=false;
        }
    }
  }
}