public class Atributos{

    public int documento ;
    public String nombres;
    public String apellidos;
    public String direccion; 
    public int telefono;
    public String email;


    public Atributos(int documento, String nombres, String apellidos, String direccion, int telefono, String email){
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    
    }

    public int getDocumento(){
        return this.documento;
    }

    public void mostrarDatosPersonales(){
        System.out.println("------------------------------------");
        System.out.println("--- DATOS PERSONALES ---               ");
        System.out.println("------------------------------------");
        System.out.println("| Documento :"+this.documento  );
        System.out.println("| Nombres :"+this.nombres  );
        System.out.println("| Apellidos :"+this.apellidos  );
        System.out.println("| Direccion :"+this.direccion  );
        System.out.println("| Telefono :"+this.telefono );
        System.out.println("| Email :"+this.email );
        System.out.println("------------------------------------");
    }

}