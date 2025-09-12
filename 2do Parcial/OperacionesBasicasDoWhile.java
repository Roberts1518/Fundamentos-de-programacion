import java.util.Scanner;

public class OperacionesBasicasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();

            System.out.print("Ingrese el operador (+, -, *, /): ");
            String operador = scanner.next();

            double resultado = 0;
            boolean valido = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                    } else {
                        System.out.println("Error: División por cero.");
                        valido = false;
                    }
                    break;
                default:
                    System.out.println("Operador no válido.");
                    valido = false;
                    break;
            }

            if (valido) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("¿Desea realizar otra operación? (si/no): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));

        scanner.close();
    }
}
