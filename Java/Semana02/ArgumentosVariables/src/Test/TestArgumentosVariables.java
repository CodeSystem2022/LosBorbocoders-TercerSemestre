
package Test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(6,7,8);
        variosParamatros("Juan","Perez", 6,7,8);
    }
    
    private static void variosParamatros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+ nombre+ " Apellido: "+ apellido);
        imprimirNumeros(numeros);
    } 
            
            
    private static void imprimirNumeros (int ...numeros){
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Elementos: "+ numeros[i]);
        }
 
    }
}


