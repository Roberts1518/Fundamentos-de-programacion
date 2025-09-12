import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);

        System.out.print("Ingrese un número entero n: ");
        int n = Stich.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  "); // Dos espacios para mejor formato
            }
            System.out.println();
        }

        Stich.close();
    }
}