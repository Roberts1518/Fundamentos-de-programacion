import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos N: ");
        int N =Stich.nextInt();

        int A = 0;
        int B = 1; 
        int C; 
        int M; 

        if (N >= 1) {
            System.out.print(A);
        }
        if (N >= 2) {
            System.out.print(", " + B);
        }

        for (M = 3; M <= N; M++) {
            C = A + B;
            System.out.print(", " + C);
            A = B;
            B = C;
        }

        System.out.println(); 

     }
}
