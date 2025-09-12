import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un número para generar su tabla de multiplicar (0 para salir): ");
            n = Stich.nextInt();

            if (n != 0) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = n * i;
                    System.out.println(n + " x " + i + " = " + resultado);
                }
            }
        } while (n != 0);

        System.out.println("Programa terminado.");
        Stich.close();
    }
}