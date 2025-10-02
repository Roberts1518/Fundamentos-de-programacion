import java.util.Scanner;

public class Tarea011025 {

    public static int[] almacenar(int n) {
        Scanner Stich = new Scanner(System.in);
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número: ");
            int numero = Stich.nextInt();
            arreglo[i] = numero;
        }
        return arreglo;
    }

  
    public static void recorrerA(int[] arreglo) {
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
  
    
    }
     public static void recorrerD(int[] arreglo) {
        System.out.println("Los números en el arreglo en posicion descendente son: ");
        for (int i = arreglo.length-1; i>=0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); 
    }
public static void buscar(int[] arreglo){
    Scanner Stich=new Scanner(System.in);
    String res="si";
    do{
        System.out.print("Ingresa el numero a buscar: ");
        int buscado = Stich.nextInt();
        boolean encontrado = false;

        for (int numero : arreglo) {
            if (numero==buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El numero " + buscado + " está en la lista.");
        } else {
            System.out.println("El numero " + buscado + " no fue encontrado.");
        }
          System.out.println("Desea buscar otro valor?");
      res=Stich.next();
    }while(res.equals("si"));
}
public static void modificarN(int[]arreglo){
 Scanner Stich=new Scanner(System.in);
 String res="si";
 boolean encontrado=false;
 
 do{
        System.out.print("Ingresa la posicion del número a modificar: ");
        int modificar = Stich.nextInt();
if (modificar < 0 || modificar >= arreglo.length) {
        System.out.println("La posicion ingresada no se encuentra en el arreglo");
       
    }else{
        System.out.println("Ingresa el nuevo numero que sustituira al valor: "+arreglo[modificar]);
        int nuevo = Stich.nextInt();
        arreglo[modificar]=nuevo;
      recorrerA(arreglo);
}
      System.out.println("Desaea modificar otro valor?");
      res=Stich.next();

 }while(res.equals("si"));
}   
public static int[] eliminarN(int[] arreglo) {
    Scanner Stich = new Scanner(System.in);
    String res = "si";

    do {
        System.out.print("Ingresa la posición del número a eliminar: ");
        int eliminar = Stich.nextInt();

        if (eliminar < 0 || eliminar >= arreglo.length) {
            System.out.println("La posición ingresada no se encuentra en el arreglo.");
        } else {
            int eliminado = arreglo[eliminar]; 
            int[] nuevo = new int[arreglo.length - 1];

            int e = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (i != eliminar) { 
                    nuevo[e] = arreglo[i];
                    e++;
                }
            }

            System.out.println("El número " + eliminado + " fue eliminado.");
            arreglo = nuevo; 
            recorrerA(arreglo);
        }

        System.out.print("¿Desea eliminar otro valor? (si/no): ");
        res = Stich.next();

    } while (res.equalsIgnoreCase("si"));

    return arreglo; 
}  

public static void ordenar1(int arreglo[]) {


    for (int i = 0; i < arreglo.length - 1; i++) {             
        for (int p = 0; p < arreglo.length - i - 1; p++) {     
            int menor = arreglo[p];
            int mayor = arreglo[p + 1];

            if (menor > mayor) {
                arreglo[p] = mayor;
                arreglo[p + 1] = menor;
            }
     
        }
    }
     recorrerA(arreglo);
}
public static void ordenar2(int arreglo[]) {


    for (int i = 0; i < arreglo.length - 1; i++) {            
        for (int p = 0; p < arreglo.length - i - 1; p++) {   
            int menor = arreglo[p];
            int mayor = arreglo[p + 1];

            if (menor < mayor) {
                arreglo[p] = mayor;
                arreglo[p + 1] = menor;
            }
     
        }
    }
     recorrerA(arreglo);
}
    public static void main(String[] args) {
        Scanner Stich = new Scanner(System.in);
        System.out.println("¿Cuántos números desea ingresar?");
        int n = Stich.nextInt();
          int[] arreglo = almacenar(n);
          String volver="si";
 do{
  System.out.println("¿Que operacion desea realizar en el arreglo:");
  System.out.println("Recorrer Ascendentemete=1 \n Recorrer Descendentemente=2 \n Buscar valor=3 \n Modificar valor=4 \n Eliminar valor=5 \n Ordenar de menor a mayor=6 \n Ordenar de mayor a menor=7");
int res=Stich.nextInt();
switch(res){
       case 1:
       recorrerA(arreglo);
       break;
       case 2: 
       recorrerD(arreglo);
       break;
       case 3:     
           buscar(arreglo);
     
              break;
              case 4:
                  modificarN(arreglo);
              
break;
case 5:
  eliminarN(arreglo);
break;
 
case 6: 
     ordenar1(arreglo);
break;
case 7:
    ordenar2(arreglo);
break;
    } 
System.out.println("Desea realizar otra operación?");
volver=Stich.next();
    }while(volver.equals("si"));
}}