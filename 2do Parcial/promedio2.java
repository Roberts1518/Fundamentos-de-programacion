import java.util.Scanner;

public class promedio2 {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones a capturar: ");
        int numCalificaciones = Stich.nextInt();

        double[] calificaciones = new double[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = Stich.nextDouble();
        }

        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];
        int reprobatorias = 0;
        StringBuilder reprobatoriasList = new StringBuilder();

        for (double calif : calificaciones) {
            suma += calif;
            if (calif > max) {
                max = calif;
            }
            if (calif < min) {
                min = calif;
            }
            if (calif < 7) {
                reprobatorias++;
                reprobatoriasList.append(calif).append(" ");
            }
        }

        double promedio = suma / numCalificaciones;

        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Número de calificaciones reprobatorias (<7): " + reprobatorias);
        if (reprobatorias > 0) {
            System.out.println("Calificaciones reprobatorias: " + reprobatoriasList.toString().trim());
        } else {
            System.out.println("No hay calificaciones reprobatorias.");
        }

        Stich.close();
    }
}
