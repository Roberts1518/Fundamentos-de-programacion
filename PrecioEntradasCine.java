import java.util.Scanner;

public class PrecioEntradasCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (lunes, martes, miercoles, jueves, viernes, sabado, domingo): ");
        String dia = scanner.next().toLowerCase();

        System.out.print("Ingrese el número de personas: ");
        int personas = scanner.nextInt();

        System.out.print("¿Cuenta con membresía? (si/no): ");
        String membresiaStr = scanner.next().toLowerCase();
        boolean membresia = membresiaStr.equals("si");

        double precioBase = 50.0;
        double precioMiercoles = 30.0;
        double precioParejaJueves = 75.0;
        double descuentoMembresia = 0.1;

        double total = 0.0;

        if (dia.equals("miercoles")) {
            total = personas * precioMiercoles;
        } else if (dia.equals("jueves")) {
            int parejas = personas / 2;
            int individuales = personas % 2;
            total = (parejas * precioParejaJueves) + (individuales * precioBase);
        } else {
            total = personas * precioBase;
        }

        if (membresia) {
            total = total * (1 - descuentoMembresia);
        }

        System.out.println("El precio total es: $" + total + " pesos");

        scanner.close();
    }
}
