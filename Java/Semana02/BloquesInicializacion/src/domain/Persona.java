
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    //Solamente podemos inicializar variables de tipo estaticas dentro de un static
    static { //Bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estatico por eso tenemos un error        
    }
    
    
}
