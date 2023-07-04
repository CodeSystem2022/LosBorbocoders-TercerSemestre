package domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    
    //Constructor vacio; esto es obligatorio para que se a un JavaBeans
    
    public Persona(){
    }
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    
    public String toString(){
        return "Persona(" + "nombre=" + nombre + ", apellido=" + apellido + ")";
        
    }

    public void setNombre(String juan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
