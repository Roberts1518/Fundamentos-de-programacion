import java.util.Scanner;

    public class EjercicioCiclo {
    public static void duplicar(int numero) {
    numero = numero * 2;
    System.out.println("Número dentro del método: " + numero);
    }
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero;
        numero = Stich.nextInt();
        duplicar(numero);
    System.out.println("Número fuera del método: " + numero);
}
}

