import java.util.Scanner;

public class EjercicioArreglos {
    public static void main(String[] args) {
        int[] A = new int [5];
        System.out.println("Ejemplo de arreglos unidimensionales");
        Scanner Stich =new Scanner(System.in);
        System.out.println("Cuantos elementos va a guardar en el arreglo?");
        int N = Stich.nextInt();

        for(int i=0; i<=4; i++){
            System.out.println("Introduce el valor para la pocision " + i);
            int valor= Stich.nextInt();
            A[i] = valor;
        }
        System.out.println("LOS VALORES DEL ARREGLO SON: ");
         for(int i=1; i<=5; i++){
         
            System.out.print(A[i] + "  ");
        }
        System.out.println("Utilizando length");
        for(int i=0; i<A.length; i++){

            System.out.print(A[i]+ " ");
        }
        System.out.println("Utilizando Forech");
        for(int i:A){
            System.out.print(A[i]+ " ");
            
        }
    }
}
