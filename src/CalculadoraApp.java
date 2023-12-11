import java.util.Scanner;

public class CalculadoraApp {
    //psvm "public static void main"
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            //sout "syustem out println
            System.out.println("****Calculadora***");
            //Mostramos el menú
            mostrarMenu();
            //Leemos la opción del usuario
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                int resultado = 0;
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                }
                else if (operacion == 5) {
                    System.out.println("\n----GOOD BYE----");
                    consola.close();
                    break;
                }
                else {
                    System.out.println("\nOpción no válida: " + operacion + "\n");
                }
            }//fin try
            catch (Exception e) {
                System.out.println("\nOpción no válida: " + e.getMessage() + "\n");
                System.out.println();
            }//fin catch
        }//fin while
    }//fin main

    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);

        System.out.print("Elige una opción: ");
    }//fin mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Escribe el primer valor: ");
        var valor1 = Integer.parseInt(consola.nextLine());
        System.out.print("Escribe el segundo valor: ");
        var valor2 = Integer.parseInt(consola.nextLine());
        int resultado = 0;
        switch (operacion) {
            case 1 -> resultado = valor1 + valor2;
            case 2 -> resultado = valor1 - valor2;
            case 3 -> resultado = valor1 * valor2;
            case 4 -> resultado = valor1 / valor2;
            default -> System.out.println("Opción no válida");
        }
        System.out.println("\n|Resultado: " + resultado + "|");
        System.out.println();
    }//fin ejecutarOperacion

}//fin clase
