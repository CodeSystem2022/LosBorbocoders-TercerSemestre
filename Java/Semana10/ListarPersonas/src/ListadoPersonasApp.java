import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del while
        List <Persona> personas = new ArrayList<>();
        //Menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        } //Fin while
    }//Fin main

    private  static  void mostrarMenu(){
        //Mostrar opciones
        System.out.print("""
                *** Listado de personas ***
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una opcion");
    } //Fin metodo

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){

        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //vemos opcion seleccionada
        switch (opcion){
            case 1 -> { //agrega persona
                System.out.print("digite nombre");
                var nombre = entrada.nextLine();
                System.out.print("digite telefono");
                var tel = entrada.nextLine();
                System.out.print("digite correo");
                var email = entrada.nextLine();
                //creo objeto persona
                var persona = new Persona(nombre, tel, email);
                //añado persona a la lista
                personas.add(persona);
                System.out.println("la lsita tiene: " + personas.size() + "elementos");
            } // fin caso 1
            case 2 -> {//lista la persona
                System.out.println("listado de personas: ");
                //Mejoras con Lmabda y el motodo de referencia
                //personas.forEach((persona -> System.out.print(persona)));
                personas.forEach(System.out::println);

            }//fin caso 2
            case 3 -> {//salir del ciclo
                System.out.println("salimos");
                salir = true;
            }
            default -> System.out.println("opcion incorrecta -> " + opcion);
        }// fin switch
        return salir;
    }//fin metodo ejecutar


}// Fin clase