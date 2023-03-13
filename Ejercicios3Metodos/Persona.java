public class Persona{

	// Atributos
	private int documento;
	private String nombres;
	private String apellidos;
	

	// Metodos
	public Persona(int documento, String nombres, String apellidos){
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public int getDocumento(){
		return this.documento;
	}

	public String getNombres(){
		return this.nombres;
	}

	public String getApellidos(){
		return this.apellidos;
	}

	public void setDocumento(int documento){
		this.documento = documento;
	}

	public void setNombres(String nombres){
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}



	public void mostrarDatosPersonales(){
		System.out.print(" | documento: "+this.documento);
		System.out.print(" | nombres: "+this.nombres);
		System.out.print(" | apellidos: "+this.apellidos);
		
	}

	public void mostrarResumenDatos(){
		System.out.println("     "+this.documento+" - "+this.nombres+" "+this.apellidos);
	}

}