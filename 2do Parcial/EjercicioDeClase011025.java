import java.util.Scanner;

public class EjercicioDeClase011025 {
    public static int [] almacenar (int n){
    Scanner Stich = new Scanner(System.in);

    int [] arreglo = new int[n];
        for (int i=0; i< n; i++){
            System.out.println("Ingrese un numero: ");
            int numero = Stich.nextInt();
            arreglo [i] = numero;
        }
        Stich.close();
        return arreglo;
    }
    
    public static void recorrer (int[]arreglo){
        System.out.println("Los numeros en el arreglo son: ");
        for(int i = 0; i<arreglo.length; i++){
        System.out.println(arreglo[i]+" ");

    }
    System.out.println();
}

    public static void main(String[] args) {
        Scanner Stich = new Scanner (System.in);
        int n = Stich.nextInt();
        int [] arreglo = almacenar(n);
        System.out.println("Que operacion desea realizar en el arreglo: ");
        int opcion = Stich.nextInt();

        switch(opcion){
            case 1: recorrer(arreglo);
            break;

        }
       Stich.close();
    }
}
