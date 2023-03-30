import java.util.Scanner;
public class E1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println ("=>Estimad@ usuario ingrese su sueldo total: ");
        int sueldo = entrada.nextInt();

        System.out.println("Ingrese la cantidad de pagos: ");
        int can_pagos = entrada.nextInt();

        System.out.println("------- FORMAS DE PAGO -------");
        System.out.println("1. Pagos de igual valor");
        System.out.println("2. Primer pago diferente");
        System.out.println("3. Ultimo pago diferente");
        System.out.println("4. Primer y ultimo pago diferente");

        System.out.println("=>Ingrese forma de pago:");
        int form_pago = entrada.nextInt();

        if (form_pago == 1){
            int total=sueldo/can_pagos;
            System.out.println("----- SUS PAGOS SERAN -----");

            for(int i=1; i<=can_pagos; i++){

                System.out.println("Mes "+i+" $" + total);
            }
        }
        int acum=0;
        int resta=0;
        if (form_pago == 2){

            int total=sueldo/can_pagos;
            acum=total;
            resta=total*(can_pagos-1);

            System.out.println("----- SUS PAGOS SERAN -----");
            System.out.println("Mes "+1+" $" + total);
            for(int i=2; i<=can_pagos; i++){

                System.out.println("Mes "+i+" $" + resta);
            }
        }
        if (form_pago == 3){

            System.out.println("Ingrese el pago final de su sueldo: ");
            int pago_final = entrada.nextInt();

            int total=sueldo/can_pagos;

            System.out.println("----- SUS PAGOS SERAN -----");
            
            for(int i=1; i<=can_pagos-1; i++){
                System.out.println("Mes "+i+" $" + total);

            }
            System.out.println("Mes final: $" + pago_final);
        }
        if (form_pago == 4){

            System.out.println("Ingrese el pago final de su sueldo: ");
            int sueldo_final = entrada.nextInt();

            int total=sueldo/can_pagos;
            acum=total;
            resta=total*(can_pagos-1);

            System.out.println("----- SUS PAGOS SERAN -----");
            System.out.println("Mes "+1+" $" + total);
            for(int i=2; i<=can_pagos-1; i++){

                System.out.println("Mes "+i+" $" + resta);
            }
            System.out.println("Mes final: $" + sueldo_final);
        }
        if (form_pago >=5 | form_pago<=0){

            System.out.println("-->Datos mal ingresados<--");
            
        }

    }
}