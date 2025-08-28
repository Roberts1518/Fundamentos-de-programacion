import java.util.Scanner;

public class MultaVelocidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la velocidad
        System.out.print("Ingresa tu velocidad: ");
        int velocidad = sc.nextInt();

        // Preguntar si es su cumpleaños
        System.out.print("¿Es tu cumpleaños? ");
        String respuesta = sc.next();

        boolean cumple;
        if (respuesta.equalsIgnoreCase("si")) {
            cumple = true;
        } else {
            cumple = false;
        }

        // Si es su cumpleaños, se reduce la velocidad en 5
        if (cumple) {
            velocidad = velocidad - 5;
        }

        int resultado;

        // Revisar en qué rango cae la velocidad
        if (velocidad <= 60) {
            resultado = 0; // sin multa
        } else if (velocidad <= 80) {
            resultado = 1; // multa pequeña
        } else {
            resultado = 2; // multa grande
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);
    }
}