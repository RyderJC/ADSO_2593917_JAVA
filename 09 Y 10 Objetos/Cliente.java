
public class Cliente {

//Atributos

int documento ;
String nombres;
String apellidos;


//Metodos


public Cliente(int documento, String nombres, String apellidos){
    this.documento = documento;
    this.nombres = nombres;
    this.apellidos = apellidos;
    
}



public int getDocumento (){
    return this.documento;
}
public String getNombres (){
    return this.nombres;
}
public String getApellidos (){
    return this.apellidos;
}

public void setDocumento(int nueva_documento){
    this.documento = nueva_documento;

}
public void setNombres(String nueva_nombres){
    this.nombres = nueva_nombres;

}

public void setApellidos(String nueva_apellidos){
    this.apellidos = nueva_apellidos;

}


public void ImprimirCartaPresentacion(){
    System.out.println("------------------------------------");
    System.out.println("--- DATOS PERSONA ---               ");
    System.out.println("------------------------------------");
    System.out.println("| documento :"+this.documento  );
    System.out.println("| nombres :"+this.nombres  );
    System.out.println("| apellidos :"+this.apellidos  );
    System.out.println("------------------------------------");

}


}

