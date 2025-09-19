import java.util.Scanner;

public class RegistroEstudiantes2 {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes a capturar: ");
        int numEstudiantes = Stich.nextInt();
        Stich.nextLine(); 

        String[] nombres = new String[numEstudiantes];
        int[] edades = new int[numEstudiantes];
        double[] promedios = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = Stich.nextLine();
            System.out.print("Edad: ");
            edades[i] = Stich.nextInt();
            System.out.print("Promedio: ");
            promedios[i] = Stich.nextDouble();
            Stich.nextLine(); 
        }

    
        System.out.println("\nRegistro de Estudiantes:");
        System.out.printf("%-20s %-5s %-10s%n", "Nombre", "Edad", "Promedio");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.printf("%-20s %-5d %-10.2f%n", nombres[i], edades[i], promedios[i]);
        }

        Stich.close();
    }
}
