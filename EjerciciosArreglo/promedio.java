import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);
        System.out.print("Ingrese el número de calificaciones a capturar: ");
        int numCalificaciones = Stich.nextInt();
         double[] calificaciones = new double[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = Stich.nextDouble();
        }

        float suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (double calif : calificaciones) {
            suma += calif;
            if (calif > max) {
                max = calif;
            }
            if (calif < min) {
                min = calif;
            }
        }

        double promedio = suma / numCalificaciones;

        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);
        System.out.println("Promedio de las calificaciones: " + promedio);

        Stich.close();
    }
}
