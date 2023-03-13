public class Principal{
    public static void main(String [] args){

        //Instacia de la clase Persona 
        
        Persona lista [] = new Persona[10];

        lista[0]= new Persona();
        lista[1]= new Persona(110888, "Jonh Alberth",  "Aricapa Pinto", "Masculino", 17, 50000, 160);
        lista[2] = new Persona(108892, "Juan David ", "Monsalve");

        lista[0].ImprimirCartaPresentacion();
        lista[1].ImprimirCartaPresentacion();
        lista[2].ImprimirCartaPresentacion();

        alberth.comer(850);
        alberth.ImprimirCartaPresentacion();

       
        alberth.comer();

    }

}