import java.util.Scanner;
import java.io.IOException;
public class Matri2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        //definiendo el mapa laberinto
        int matriz [][] =  {
            {1,1,1,1,1,1,1},
            {1,0,0,0,1,0,3},
            {1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1},
            {0,2,1,0,0,0,1},
            {1,1,1,1,1,1,1},
        };
        
        //ciclo del laberinto
        boolean jugando = true;
        int pos_f = 4;
        int pos_c = 1;

        while(jugando){

            //imprimir el laberinto

            try { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); } catch (Exception e) {}
            for(int i=0; i<matriz.length; i++){
                System.out.print("   ");

                for(int j=0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }

            //imprimir el menu

            System.out.println("1.Arriba.  2.Abajo.  3.Derecha.  4.Izquierda.");
            int opcion = entrada.nextInt();

            //condicion segun la seleccion del usuario

            //codigo para mover abajo

            if(opcion==1){
                if(matriz[pos_f-1][pos_c] == 0){
                    matriz[pos_f-1][pos_c] =2;
                    matriz[pos_f][pos_c] =0;
                    pos_f = pos_f-1;
                    pos_c=pos_c;
                }else if (matriz[pos_f+1][pos_c] ==3){
                    jugando = false;
                    
                }
            }

            //codigo para mover Abajo
            if(opcion==2){
                if(matriz[pos_f+1][pos_c] == 0){
                    matriz[pos_f+1][pos_c] =2;
                    matriz[pos_f][pos_c] =0;
                    pos_f = pos_f+1;
                    pos_c=pos_c;
                }else if (matriz[pos_f+1][pos_c] ==3){
                    jugando = false;
                    
                }
            }

            //codigo para mover Derecha
            if(opcion==3){
                if(matriz[pos_f][pos_c+1] == 0){
                    matriz[pos_f][pos_c+1] =2;
                    matriz[pos_f][pos_c] =0;
                    pos_f = pos_f;
                    pos_c=pos_c+1;
                }else if (matriz[pos_f][pos_c+1] ==3){
                    jugando = false;
                }
            }

            //codigo para mover Izquierda
            if(opcion==4){
                if(matriz[pos_f][pos_c-1] == 0){
                    matriz[pos_f][pos_c-1] =2;
                    matriz[pos_f][pos_c] =0;
                    pos_f = pos_f;
                    pos_c=pos_c-1;
                }else if (matriz[pos_f][pos_c-1] ==3){
                    jugando = false;
                }
            }
            //Condicion de movimiento invalido
            if (opcion<1 || opcion>4){
                System.out.println("MOVIMIENTO INVALIDO");
            }
        }
	    System.out.println(" ----- FINISH ------");
    }
}