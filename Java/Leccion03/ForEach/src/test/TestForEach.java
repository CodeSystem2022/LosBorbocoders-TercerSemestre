
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9}; //Sintaxis resumida
        for (int edad: edades) { //sintaxis del forEach
            System.out.println("edad = "+edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Martin"), new Persona("Messi")};
        
        //ForEach
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
