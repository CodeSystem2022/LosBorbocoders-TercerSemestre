
//Excepciones

package test;

//import aritmetica.Aritmetica;
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            //resultado = 10/0;
            //resultado = Aritmetica.division(10, 0);
            //resultado = division(10, 0);
            resultado = division(10, 2);
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrio un Error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);//se conoce como pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable de resultado tiene como valor:  = " + resultado);
    }
}
