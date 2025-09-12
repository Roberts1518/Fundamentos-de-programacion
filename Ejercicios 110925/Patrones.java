import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);

        System.out.print("Ingrese el número de líneas para los patrones 2 y 3: ");
        int n = Stich.nextInt();

        System.out.println("Patrón 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println(); 
        System.out.println("Patrón 2:");
        for (int i = 0; i < n; i++) {
            for (int espacios = 0; espacios < i; espacios++) {
                System.out.print("  ");
            }
            int numAsteriscos = 2 * (n - i) - 1;
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); 
        System.out.println("Patrón 3:");
        for (int i = 1; i <= n; i++) {
            for (int espacios = 0; espacios < n - i; espacios++) {
                System.out.print("  ");
            }
            int numAsteriscos = 2 * i - 1;
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Stich.close();
    }
}