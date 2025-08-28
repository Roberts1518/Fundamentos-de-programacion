import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número entero a: ");
        int a = scanner.nextInt();
        
        System.out.print("Introduce el número entero b: ");
        int b = scanner.nextInt();
        
        System.out.print("Introduce el número entero c: ");
        int c = scanner.nextInt();
        
        int resultado = calcularResultado(a, b, c);
        System.out.println("El resultado es: " + resultado);
        
        scanner.close();
    }

    public static int calcularResultado(int a, int b, int c) {
        int sumaAb = a + b;
        int sumaBc = b + c;
        int sumaAc = a + c;

        if (sumaAb == 10 || sumaBc == 10 || sumaAc == 10) {
            return 10;
        } else if (sumaAb == sumaBc + 10 || sumaAb == sumaAc + 10) {
            return 5;
        } else {
            return 0;
        }

   }
}