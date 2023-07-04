package excepciones;

public class OperacionExcepcion extends RuntimeExcepcion{
    
    //Constructor
        
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }

    public boolean getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
