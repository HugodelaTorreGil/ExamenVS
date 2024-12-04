import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dos números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Pedir la operación a realizar
        System.out.print("Introduce la operación (suma/resta): ");
        String operacion = scanner.next();

        // Realizar la operación correspondiente
        if (operacion.equalsIgnoreCase("suma")) {
            suma(num1, num2);
        } else if (operacion.equalsIgnoreCase("resta")) {
            resta(num1, num2);
        } else {
            System.out.println("Operación no válida. Por favor, introduce 'suma' o 'resta'.");
        }

        scanner.close();
    }

    // Método para realizar la suma
    public static void suma(double a, double b) {
        double resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    // Método para realizar la resta
    public static void resta(double a, double b) {
        double resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}