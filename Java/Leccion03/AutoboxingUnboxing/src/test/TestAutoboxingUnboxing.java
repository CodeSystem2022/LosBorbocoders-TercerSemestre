
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
        
            int = la clase envolvente es Integer
            float = la clase envolvente es float
            Double = la clase envolvente es double
            Boolean = la clase envolvente es boolean
            Byte = la clase envolvente es byte
            Char = la clase envolvente es Character
            Short = la clase envolvente es Short
        */
        
        int enteroPrim = 10;// Tipo Primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo object con la clase Integer
        //Autoboxing: Cuando una literal de tipo primitiva lo convierto en otro tipo
        System.out.println("entero = " + entero.toString()); //lo pasa a cadena
        System.out.println("entero = " + entero.byteValue()); // lo pasa a byte
        System.out.println("entero = " + entero.shortValue());// Es un tipo short
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
        
        
    }
}
