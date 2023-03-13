import java.util.Scanner;

public class Principal2{
    public static void main(String [] args){

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Atributos Registrar [] = new Atributos [10];

        int i=1;
        int n=9999;
        int cont=0;
        while(i<n){
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("|| ------------------ PERSONAS ----------------- ||");
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("||                            Personas Registradas:"+cont+"");
            System.out.println("|| 1. Registrar Persona. ||");
            System.out.println("|| 2. Ver lista de Personas. ||");
            System.out.println("|| 3. Ordenar lista Personas. ||");
            System.out.println("|| 4. Salir. ||");
            System.out.println("|| --------------------------------------------------- ||");

            System.out.println("Ingrese la opcion ");
            int opcion = entrada_numero.nextInt();

            if (opcion == 1){

                System.out.println("Indique su numero de documento :");
                int documento = entrada_numero.nextInt();

                System.out.println("Indique su nombre :");
                String nombres = entrada_texto.nextLine();

                System.out.println("Indique su apellido :");
                String apellidos = entrada_texto.nextLine();

                System.out.println("Indique su direccion :");
                String direccion = entrada_texto.nextLine();

                System.out.println("Indique su telefono :");
                int telefono = entrada_numero.nextInt();

                System.out.println("Indique su email :");
                String email = entrada_texto.nextLine();
                i=2;

                Registrar[cont]= new Atributos(documento, nombres, apellidos, direccion, telefono, email);
                cont++;

            }if (opcion == 2){
                for ( i=0 ; i<Registrar.length;i++) {
                    if(Registrar[i]!=null){
                        System.out.println("------------------------------------");
                        System.out.println("--- DATOS PERSONALES ---               ");
                        System.out.println("------------------------------------");
                        System.out.println("| Documento :"+Registrar[i].documento  );
                        System.out.println("| Nombres :"+Registrar[i].nombres  );
                        System.out.println("| Direccion :"+Registrar[i].direccion  );
                        System.out.println("| Telefono :"+Registrar[i].telefono );
                        System.out.println("| Email :"+Registrar[i].email );
                        System.out.println("------------------------------------");

                    }else if (Registrar[i]== null){
                        System.out.println("Casilla N:"+i+" vacio" );
                    }
                }
            }if (opcion == 3){
                for( i =0; i<Registrar.length;i++ ){
                    for(int j =0; j<Registrar.length;j++ ){
                        if(Registrar[j]!= null && Registrar[j+1]!=null){
                            if(Registrar[j].getDocumento() > Registrar[j+1].getDocumento()){
                                Atributos aux = Registrar[j];
                                Registrar[j] = Registrar[j+1];
                                Registrar[j+1] = aux;
                            }
                        }
                    }
                }

            }if (opcion == 4 ){
                System.out.println("--------------------->");
                System.out.println("Usted salio");
                System.out.println("--------------------->");

                
                n=0;
            }
        

            

        }

    }
}          