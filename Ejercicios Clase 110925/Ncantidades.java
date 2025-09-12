import java.util.Scanner;

public class Ncantidades {

public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    int CP = 0;
    int CN = 0;
    int C = 1;
    double NU;
    int CA;

    System.out.println("Ingrese el numero de veces que desea repetir: ");
    NU = Scanner.nextInt();

    do{
        System.out.println ("Ingrese un numero:" );
        CA = Scanner.nextInt();
        if (CA > 0){
            CP = CP + 1;
        } else {
            CN = CN + 1;
        }   
        C++;
    } while (C <= NU); 
        System.out.println("Positivos: "+ CP);
        System.out.println("Negativos: "+ CN);

}
}
