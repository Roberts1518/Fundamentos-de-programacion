import java.util.Scanner;

public class PresupuestoTartas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la pastelería de Roberts, Vamos hacer un presupuesto para su tarta.");
        System.out.print("De qué sabor quiere la tarta? (Manzana, Fresa, Chocolate): ");
        String sabor = scanner.next().toLowerCase();

        double precioBase = 0.0;

        if (sabor.equals("Manzana")) {
            precioBase = 200.0;
        } else if (sabor.equals("Fresa")) {
            precioBase = 250.0;
        } else if (sabor.equals("Chocolate")) {
            System.out.print("¿El Chocolate es Negro o Blanco? ");
            String tipoChocolate = scanner.next().toLowerCase();
            if (tipoChocolate.equals("Negro")) {
                precioBase = 280.0;
            } else if (tipoChocolate.equals("Blanco")) {
                precioBase = 300.0;
            } else {
                System.out.println("Tipo de chocolate no válido.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Sabor no válido.");
            scanner.close();
            return;
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

        scanner.close();
    }
}
