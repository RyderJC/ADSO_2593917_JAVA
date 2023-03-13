import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {

		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		int opcion = 0;
		int pos_disponible = 0;
		Persona arreglo [] = new Persona [100];

		do{
			System.out.println("||----------------------------------||");
			System.out.println("||------------ PERSONAS ------------||");
			System.out.println("||----------------------------------||");
			System.out.println("||------- Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+" -||");
			System.out.println("||                                  ||");
			System.out.println("||   1. Registrar Persona.          ||");
			System.out.println("||   2. Ver clientes registrados .  ||");
			System.out.println("||   3. Modificar Informacion Cliente||");
			System.out.println("||   4. Ver informacion del cliente.||");
			System.out.println("||                                  ||");
			System.out.println("||----------------------------------||");
			System.out.print("||=> Ingrese una opcion: ");
			opcion = entrada_numero.nextInt();

			if (opcion == 1) {
				System.out.print("||=> Ingrese el documento: ");
				int documento = entrada_numero.nextInt();

				System.out.print("||=> Ingrese los nombres: ");
				String nombres = entrada_texto.nextLine();

				System.out.print("||=> Ingrese los apellidos: ");
				String apellidos = entrada_texto.nextLine();


				Persona temporal = new Persona(documento, nombres, apellidos);
				
				boolean valido = true;
				for (int i=0; i<pos_disponible; i++) {
					if (temporal.getDocumento() == arreglo[i].getDocumento()) {
						valido = false;
						System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
						break;
					}
				}

				if (valido) {
					arreglo[pos_disponible] = temporal;
					pos_disponible++;
					System.out.println("||===> REGISTRADO CON EXITO \n\n");
				}

			}else if (opcion == 2) {
				for (int i=0; i<arreglo.length; i++) {
					if (arreglo[i]!=null) {
						arreglo[i].mostrarResumenDatos();
					}
				}
				System.out.println("\n\n");
			}else if (opcion == 3) {
				System.out.println("Indique el numero de documento del cliente a modificar  :");
                int modificar = entrada_numero.nextInt();
                int buscar=0;
                for(int j=0;j<pos_disponible ;j++){
                    if (modificar == arreglo[j].getDocumento()){
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
                        
                                arreglo[j].setDocumento(documento_n);

                            }else if(buscar == 2){
                                System.out.println("Indique el nuevo nombre");
                                String nombre_n = entrada_texto.nextLine();
                        
                                arreglo[j].setNombres(nombre_n);
                            }else if(buscar == 3){
                                System.out.println("Indique el nuevo apellido");
                                String apellido_n = entrada_texto.nextLine();
                        
                                arreglo[j].setApellidos(apellido_n);
                            }
                        }while(buscar == 4);
                    }else{
                        if(modificar != arreglo[j].getDocumento()){
                            System.out.println(" Indique un documento valido");
                        }
                    }
               
                }
				

			}else if (opcion == 4) {
				int buscar2=0;
				

				System.out.println("Indique el documento de la persona que quiere ver a informacion ");
				buscar2 = entrada_numero.nextInt();

				for (int i=0; i<pos_disponible; i++) {
					if (buscar2 == arreglo[i].getDocumento()) {
						arreglo[i].mostrarResumenDatos();
					}
				}

			}else if (opcion == 5){
				

			
	
			}
		}while(opcion!=6);

	}
}

