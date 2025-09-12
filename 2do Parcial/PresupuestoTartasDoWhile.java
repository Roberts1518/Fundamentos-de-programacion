import java.util.Scanner;

public class PresupuestoTartasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;

        do {
            System.out.println("Bienvenido a la pastelería de Roberts, Vamos hacer un presupuesto para su tarta.");
            System.out.print("De qué sabor quiere la tarta? (Manzana, Fresa, Chocolate): ");
            String sabor = scanner.next().toLowerCase();

            double precioBase = 0.0;

            if (sabor.equals("manzana")) {
                precioBase = 200.0;
            } else if (sabor.equals("fresa")) {
                precioBase = 250.0;
            } else if (sabor.equals("chocolate")) {
                System.out.print("¿El Chocolate es Negro o Blanco? ");
                String tipoChocolate = scanner.next().toLowerCase();
                if (tipoChocolate.equals("negro")) {
                    precioBase = 280.0;
                } else if (tipoChocolate.equals("blanco")) {
                    precioBase = 300.0;
                } else {
                    System.out.println("Tipo de chocolate no válido.");
                    continue;
                }
            } else {
                System.out.println("Sabor no válido.");
                continue;
            }

            double total = precioBase;

            System.out.print("¿Desea añadir snacks? (si/no): ");
            String añadirSnacks = scanner.next().toLowerCase();
            if (añadirSnacks.equals("si")) {
                System.out.print("¿Cuántos snacks desea añadir? ");
                int numSnacks = scanner.nextInt();
                total += numSnacks * 25.0;
            }

            System.out.print("¿Desea personalizar con un nombre? (si/no): ");
            String personalizar = scanner.next().toLowerCase();
            if (personalizar.equals("si")) {
                total += 30.0;
            }

            System.out.println("El precio total de la tarta es: $" + total + " pesos");

            System.out.println("¿Desea hacer otro presupuesto? (1 para sí, 0 para no): ");
            opcion = scanner.nextInt();
        } while (opcion == 1);

        scanner.close();
    }
}
