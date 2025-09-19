public class EjemploMultiYJuan {

    public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
    }

     public static int multiplicar(int a, int b) {
    return a * b;
    }
    public static void main(String[] args) {
    saludar("Juan");

    int resultado = multiplicar(4, 5);
    System.out.println(resultado);

    }
}