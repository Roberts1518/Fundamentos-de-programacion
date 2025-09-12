import java.util.Scanner;

public class MesDiasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes;

        do {
            System.out.print("Introduce el número del mes (1-12): ");
            mes = scanner.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Mes inválido. Debe estar entre 1 y 12. Inténtalo de nuevo.");
            }
        } while (mes < 1 || mes > 12);

        String nommes = "";
        int dias = 0;

        switch (mes) {
            case 1: nommes = "Enero"; dias = 31; break;
            case 2: nommes = "Febrero"; dias = 28; break;
            case 3: nommes = "Marzo"; dias = 31; break;
            case 4: nommes = "Abril"; dias = 30; break;
            case 5: nommes = "Mayo"; dias = 31; break;
            case 6: nommes = "Junio"; dias = 30; break;
            case 7: nommes = "Julio"; dias = 31; break;
            case 8: nommes = "Agosto"; dias = 31; break;
            case 9: nommes = "Septiembre"; dias = 30; break;
            case 10: nommes = "Octubre"; dias = 31; break;
            case 11: nommes = "Noviembre"; dias = 30; break;
            case 12: nommes = "Diciembre"; dias = 31; break;
        }

        System.out.println("El mes " + nommes + " tiene " + dias + " días.");

        scanner.close();
    }
}
