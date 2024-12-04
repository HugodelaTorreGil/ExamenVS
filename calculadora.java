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
        System.out.print("Introduce la operación (suma/resta/multiplicación/división): ");
        String operacion = scanner.next();

        // Realizar la operación correspondiente
        if (operacion.equalsIgnoreCase("suma")) {
            suma(num1, num2);
        } else if (operacion.equalsIgnoreCase("resta")) {
            resta(num1, num2);
        } else if (operacion.equalsIgnoreCase("multiplicación")) {
            multiplicacion(num1, num2);
        } else if (operacion.equalsIgnoreCase("división")) {
            if (num2 != 0) {
                division(num1, num2);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operación no válida. Por favor, introduce 'suma', 'resta', 'multiplicación' o 'división'.");
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

    // Método para realizar la multiplicación
    public static void multiplicacion(double a, double b) {
        double resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    // Método para realizar la división
    public static void division(double a, double b) {
        double resultado = a / b;
        System.out.println("El resultado de la división es: " + resultado);
    }
}