import java.util.Scanner;

public class Principal4{
    public static void main(String [] args){

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Cliente Registrar [] = new Cliente [10];

        int i=1;
        int n=9999;
        int cont=0;
        while(i<n){
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("|| ------------------ PERSONAS ----------------- ||");
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("||                            Personas Registradas:"+cont+"");
            System.out.println("|| 1. Registrar Persona. ||");
            System.out.println("|| 2. Ver clientes registrados. ||");
            System.out.println("|| 3. Modificar informacion del cliente. ||");  
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

                i=2;

                Registrar[cont]= new Cliente(documento, nombres, apellidos);
                cont++;

            }if (opcion == 2){
                for ( i=0 ; i<Registrar.length;i++) {
                    if(Registrar[i]!=null){
                        System.out.println("------------------------------------");
                        System.out.println("--- DATOS PERSONALES ---               ");
                        System.out.println("------------------------------------");
                        System.out.println("| Documento :"+Registrar[i].documento  );
                        System.out.println("| Nombres :"+Registrar[i].nombres  );
                        System.out.println("| Apellidos :"+Registrar[i].apellidos  );
                        System.out.println("------------------------------------");

                    }
                }
            }if (opcion == 3){
                System.out.println("Indique el numero de documento del cliente a modificar  :");
                int modificar = entrada_numero.nextInt();
                int buscar=0;
                for(int j=0;j<cont ;j++){
                    if (modificar == Registrar[i].getDocumento()){
                        do{
                            System.out.println("1.Documento");
                            System.out.println("2.Nombre");
                            System.out.println("3.Apellido");
                            System.out.println("4. salir");
                            System.out.println("Indique que informacion quiere modificar del cliente ");
                            buscar = entrada_numero.nextInt();

                            if (buscar == 1){
                                System.out.println("Indique el nuevo documento");
                                int documento_n = entrada_numero.nextInt();
                        
                                Registrar[i].setDocumento(documento_n);

                            }else if(buscar == 2){
                                System.out.println("Indique el nuevo nombre");
                                String nombre_n = entrada_texto.nextLine();
                        
                                Registrar[i].setNombres(nombre_n);
                            }else if(buscar == 3){
                                System.out.println("Indique el nuevo apellido");
                                String apellido_n = entrada_texto.nextLine();
                        
                                Registrar[i].setApellidos(apellido_n);
                            }
                        }while(buscar == 4);
                    }else{
                        if(modificar != Registrar[i].getDocumento()){
                            System.out.println(" Indique un documento valido");
                        }
                    }
               
                }
                

                


            }if (opcion == 6 ){
                System.out.println("--------------------->");
                System.out.println("Usted salio");
                System.out.println("--------------------->");
                n=0;
            }
        
        }

    }
}          