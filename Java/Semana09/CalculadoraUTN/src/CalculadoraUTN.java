import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {//Ciclo infinito, se corta con el brake

            System.out.println("***** Aplicacion Calculadora *****");
            mostrarMenu(); //Llamo al metodo que muestra el menú

            try {
                var operacion = Integer.parseInt(entrada.nextLine());

                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, entrada);

                } // Fin del if

                else if (operacion == 5) {
                    System.out.println("Adios");
                    break; // Rompe el ciclo while
                } else {
                    System.out.println("Opcion erronea " + operacion + " no es una opción válida");
                }
                //Ahora dentro del while imprimo un salto de linea para que no quede todo pegado
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error -> " + e.getMessage());
                System.out.println();
            }
            } // Fin while
    } // Fin del main

    //Recordar que el static me permite ejecutar dentro del mismo main(que tambien es static)
    private static void mostrarMenu(){ /*Metodo para mostrar menú*/
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.print("Operación a realizar ? ");
    } //Fin metodo que muestra menú

   private static void ejecutarOperacion(int operacion, Scanner entrada){
       System.out.print("Ingrese el valor del operando1: ");
       var operando1 = Double.parseDouble(entrada.nextLine());

       System.out.print("Ingrese el valor del operando2: ");
       var operando2 = Double.parseDouble(entrada.nextLine());

       double resultado;

       switch (operacion) {
           case 1 -> {
               resultado = operando1 + operando2;
               System.out.println("Resultado de la suma : " + resultado);
           }
           case 2 -> {
               resultado = operando1 - operando2;
               System.out.println("Resultado de la resta : " + resultado);
           }
           case 3 -> {
               resultado = operando1 * operando2;
               System.out.println("Resultado de la multiplicacion : " + resultado);
           }
           case 4 -> {
               resultado = operando1 / operando2;
               System.out.println("Resultado de la division : " + resultado);
           }
           default -> System.out.println("Opcion erronea " + operacion);

       } // Fin del metodo ejecutarOperacion
   }
}// Fin de clase
