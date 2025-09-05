import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el caracter (+, -, *, /): ");
        String caracter = scanner.next();

        double resultado = 0;
        boolean error = false;

        switch (caracter) {
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
                }
                break;
            default:
                
                System.out.println("Operador no válido.");
                break;
        }

        if (!error) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
