import java.util.Scanner;

public class ListadoEstudiantes {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes a capturar: ");
        int numEstudiantes = Stich.nextInt();
        Stich.nextLine(); 

        String[] nombres = new String[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = Stich.nextLine();
        }

        System.out.println("\nListado de estudiantes:");
        for (int i = 0; i < numEstudiantes; i++) {
            String nombre = nombres[i];
            int numCaracteres = nombre.length();
            String nombreConvertido;

            if (nombre.equals(nombre.toLowerCase())) {
                nombreConvertido = nombre.toUpperCase();
            } else {
                nombreConvertido = nombre.toLowerCase();
            }

            System.out.println("Estudiante " + (i + 1) + ": " + nombre + " - Número de caracteres: " + numCaracteres + " - Convertido: " + nombreConvertido);
        }

        Stich.close();
    }
}
