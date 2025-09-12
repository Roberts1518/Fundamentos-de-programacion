import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AH = 0;
        int M = 1;
        int CA;

        while (M <= 12) {
            System.out.print("Ingrese el ahorro del mes " + M + ": ");
            CA = scanner.nextInt();
            AH = AH + CA;
              M++;
            System.out.println("El ahorro del mes " + M + " es " + AH);
        }

        scanner.close();
    }
}
