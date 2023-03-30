import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("INGRESE UNA FECHA EN NUMEROS: ");
        int fecha = entrada.nextInt();

        int dig_1=fecha%10;
        int dig_2=(fecha/10)%10;
        int dig_3=(fecha/100)%10;
        int dig_4=(fecha/1000)%10;
        int dig_5=(fecha/10000)%10;
        int dig_6=(fecha/100000)%10;
        int dig_7=(fecha/1000000)%10;
        int dig_8=(fecha/10000000)%10;

        if(dig_8==0){
            if(dig_7==9){
                System.out.print("NUEVE ");
            }else if(dig_7==8){
                System.out.print("OCHO ");
            }else if(dig_7==7){
                System.out.print("SIETE ");
            }else if(dig_7==6){
                System.out.print("SEIS ");
            }else if(dig_7==5){
                System.out.print("CINCO ");
            }else if(dig_7==4){
                System.out.print("CUATRO ");
            }else if(dig_7==3){
                System.out.print("TRES ");
            }else if(dig_7==2){
                System.out.print("DOS ");
            }else if(dig_7==1){
                System.out.print("PRIMERO ");
            }
        }else if(dig_8==1){
            if(dig_7==0){
            System.out.print("DIEZ ");
            }else if(dig_7==1){
                System.out.print("ONCE ");
            }else if(dig_7==2){
                System.out.print("DOCE "); 
            }else if(dig_7==3){
                System.out.print("TRECE "); 
            }else if(dig_7==4){
                System.out.print("CATORCE "); 
            }else if(dig_7==5){
                System.out.print("QUINCE "); 
            }else if(dig_7==6){
                System.out.print("DIECISEIS "); 
            }else if(dig_7==7){
                System.out.print("DIECISIETE "); 
            }else if(dig_7==8){
                System.out.print("DIECIOCHO "); 
            }else if(dig_7==9){
                System.out.print("DIECINUEVE "); 
            }
        }else if(dig_8==2){
            if(dig_7==0){
                System.out.print("VEINTE ");
            }else if(dig_7==1){
                System.out.print("VEINTIUNO ");
            }else if(dig_7==2){
                System.out.print("VEINTIDOS ");
            }else if(dig_7==3){
                System.out.print("VEINTITRES ");
            }else if(dig_7==4){
                System.out.print("VEINTICUATRO ");
            }else if(dig_7==5){
                System.out.print("VEINTICINCO ");
            }else if(dig_7==6){
                System.out.print("VEINTISEIS ");
            }else if(dig_7==7){
                System.out.print("VEINTISIETE ");
            }else if(dig_7==8){
                System.out.print("VEINTIOCHO ");
            }else if(dig_7==9){
                System.out.print("VEINTINUEVE ");
            }
        }else if(dig_8==3){
            if(dig_7==0){
                System.out.print("TREINTA ");
            }else if(dig_7==1){
                System.out.print("TREINTA Y UNO " );
            }else if(dig_7==2){
                System.out.print("TREINTA Y DOS ");
            }else if(dig_7==3){
                System.out.print("TREINTA YTRES ");
            }else if(dig_7==4){
                System.out.print("TREINTA Y CUATRO ");
            }else if(dig_7==5){
                System.out.print("TREINTA Y CINCO ");
            }else if(dig_7==6){
                System.out.print("TREINTA Y SEIS ");
            }else if(dig_7==7){
                System.out.print("TREINTA Y SIETE ");
            }else if(dig_7==8){
                System.out.print("TREINTA Y OCHO ");
            }else if(dig_7==9){
                System.out.print("TREINTA Y NUEVE ");
            }
        }
        System.out.print("DE ");
        if(dig_6==0){
            if(dig_5==1){
            System.out.print("ENERO "); 
            }else if(dig_5==2){
                System.out.print("FEBRERO ");
            }else if(dig_5==3){
                System.out.print("MARZO ");
            }else if(dig_5==4){
                System.out.print("ABRIL ");
            }else if(dig_5==5){
                System.out.print("MAYO ");
            }else if(dig_5==6){
                System.out.print("JUNIO ");
            }else if(dig_5==7){
                System.out.print("JULIO ");
            }else if(dig_5==8){
                System.out.print("AGOSTO ");
            }else if(dig_5==9){
                System.out.print("SEPTIEMPRE ");
            }
        }else if(dig_6==1){
            if(dig_5==0){
                System.out.print("OCTUBRE ");
            }else if(dig_5==1){
                System.out.print("NOVIEMBRE ");
            }else if(dig_5==2){
                System.out.print("DICIEMBRE ");
            }
        }
        System.out.print("DEL ");
        if(dig_4==1){
            System.out.print("MIL ");
        }else if(dig_4==2){
            System.out.print("DOS MIL ");
        }else if(dig_4==3){
            System.out.print("TRES MIL ");
        }else if(dig_4==4){
            System.out.print("CUATRO MIL ");
        }else if(dig_4==5){
            System.out.print("CINCO MIL ");
        }else if(dig_4==6){
            System.out.print("SEIS MIL ");
        }else if(dig_4==7){
            System.out.print("SIETE MIL ");
        }else if(dig_4==8){
            System.out.print("OCHO MIL ");
        }else if(dig_4==9){
            System.out.print("NUEVE MIL ");
        }
        if (dig_3 == 9){
            System.out.print("NOVECIENTOS ");
        }else if(dig_3 == 8){
            System.out.print("OCHOCIENTOS ");
        }else if(dig_3 == 7){
            System.out.print("SETECIENTOS ");
        }else if(dig_3 == 6){
            System.out.print("SEISCIENTOS ");
        }else if(dig_3 == 5){
            System.out.print("QUINIENTOS ");
        }else if(dig_3 == 4){
            System.out.print("CUATROCIENTOS ");
        }else if(dig_3 == 3){
            System.out.print("TRECIENTOS ");
        }else if(dig_3 == 2){
            System.out.print("DOSCIENTOS ");
        }else if(dig_3 == 1){
            if(dig_2 ==0 && dig_1==0){
                System.out.print("CIEN ");
            }else{
                System.out.print("CIENTO ");
            }
        }if(dig_2 == 9){
            if(dig_1==0){
                System.out.print("NOVENTA ");
            }else{
                System.out.print("NOVENTA Y ");
            }
           
        }else if(dig_2 == 8){
            if(dig_1==0){
                System.out.print("OCHENTA ");
            }else{
                System.out.print("OCHENTA Y ");
            }
        }else if(dig_2 == 7){
            if(dig_1==0){
                System.out.print("SETENTA ");
            }else{
                System.out.print("SETENTA Y " );
            }
        }else if(dig_2 == 6){
            if(dig_1==0){
                System.out.print("SESENTA ");
            }else{
                System.out.print("SESENTA Y ");
            }
        }else if(dig_2 == 5){
            if(dig_1==0){
                System.out.print("CINCUENTA ");
            }else{
                System.out.print("CINCUENTA Y ");
            }
        }else if(dig_2 == 4){
            if(dig_1==0){
                System.out.print("CUARENTA ");
            }else{
                System.out.print("CUARENTA Y ");
            }
        }else if(dig_2 == 3){
            if(dig_1==0){
                System.out.print("TREINTA ");
            }else{
                System.out.print("TREINTA Y ");
            }
        }else if(dig_2 == 2){
            if(dig_1==0){
                System.out.print("VEINTE ");
            }else{
                System.out.print("VEINTI ");
            }
        }else if(dig_2 == 1){
            if(dig_1==0){
                System.out.print("DIEZ ");
            }else if(dig_1==1){
                System.out.print("ONCE ");
            }else if(dig_1==2){
                System.out.print("DOCE ");
            }else if(dig_1==3){
                System.out.print("TRECE ");
            }else if(dig_1==4){
                System.out.print("CATORCE ");
            }else if(dig_1==5){
                System.out.print("QUINCE ");
            }else if(dig_1==6){
                System.out.print("DIECI ");
            }
        }else if (dig_2==0){
            System.out.print("");

        }
        if(dig_1==9){
            System.out.print("NUEVE ");
        }else if(dig_1==8){
            System.out.print("OCHO ");
        }else if(dig_1==7){
            System.out.print("SIETE ");
        }else if(dig_1==6){
            System.out.print("SEIS ");
        }else if(dig_1==5){
            System.out.print("CINCO ");
        }else if(dig_1==4){
            System.out.print("CUATRO ");
        }else if(dig_1==3){
            System.out.print("TRES ");
        }else if(dig_1==2){
            System.out.print("DOS ");
        }else if(dig_1==1){
            System.out.print("UNO ");
        }else if(dig_1==0){
            System.out.print("");
        }
    
    }
}