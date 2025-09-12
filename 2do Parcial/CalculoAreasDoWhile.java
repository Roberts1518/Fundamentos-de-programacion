import java.util.Scanner;

public class CalculoAreasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción para calcular el área:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("Área del cuadrado: " + areaCuadrado);
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    double areaRectangulo = baseRect * alturaRect;
                    System.out.println("Área del rectángulo: " + areaRectangulo);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    double areaTriangulo = (baseTri * alturaTri) / 2;
                    System.out.println("Área del triángulo: " + areaTriangulo);
                    break;
                case 4:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("Área del círculo: " + areaCirculo);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}
