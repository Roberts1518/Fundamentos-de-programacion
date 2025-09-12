import java.util.Scanner;

public class HoroscopoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese su día de nacimiento: ");
            int dia = sc.nextInt();
            System.out.println("Ingrese el número de mes de su nacimiento (1-12): ");
            int mes = sc.nextInt();

            switch (mes) {
                case 1:
                    if (dia >= 1 && dia <= 19) {
                        System.out.println("Su signo es Capricornio");
                    } else if (dia >= 20 && dia <= 31) {
                        System.out.println("Su signo es Acuario");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <= 18) {
                        System.out.println("Su signo es Acuario");
                    } else if (dia >= 19 && dia <= 29) {
                        System.out.println("Su signo es Piscis");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 3:
                    if (dia >= 1 && dia <= 20) {
                        System.out.println("Su signo es Piscis");
                    } else if (dia >= 21 && dia <= 31) {
                        System.out.println("Su signo es Aries");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 4:
                    if (dia >= 1 && dia <= 19) {
                        System.out.println("Su signo es Aries");
                    } else if (dia >= 20 && dia <= 30) {
                        System.out.println("Su signo es Tauro");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 5:
                    if (dia >= 1 && dia <= 20) {
                        System.out.println("Su signo es Tauro");
                    } else if (dia >= 21 && dia <= 31) {
                        System.out.println("Su signo es Géminis");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 6:
                    if (dia >= 1 && dia <= 20) {
                        System.out.println("Su signo es Géminis");
                    } else if (dia >= 21 && dia <= 31) {
                        System.out.println("Su signo es Cáncer");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 7:
                    if (dia >= 1 && dia <= 22) {
                        System.out.println("Su signo es Cáncer");
                    } else if (dia >= 23 && dia <= 31) {
                        System.out.println("Su signo es Leo");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 8:
                    if (dia >= 1 && dia <= 22) {
                        System.out.println("Su signo es Leo");
                    } else if (dia >= 23 && dia <= 31) {
                        System.out.println("Su signo es Virgo");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 9:
                    if (dia >= 1 && dia <= 22) {
                        System.out.println("Su signo es Virgo");
                    } else if (dia >= 23 && dia <= 30) {
                        System.out.println("Su signo es Libra");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 10:
                    if (dia >= 1 && dia <= 22) {
                        System.out.println("Su signo es Libra");
                    } else if (dia >= 23 && dia <= 31) {
                        System.out.println("Su signo es Escorpio");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 11:
                    if (dia >= 1 && dia <= 21) {
                        System.out.println("Su signo es Escorpio");
                    } else if (dia >= 22 && dia <= 30) {
                        System.out.println("Su signo es Sagitario");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                case 12:
                    if (dia >= 1 && dia <= 21) {
                        System.out.println("Su signo es Sagitario");
                    } else if (dia >= 22 && dia <= 31) {
                        System.out.println("Su signo es Capricornio");
                    } else {
                        System.out.println("Día no válido");
                    }
                    break;
                default:
                    System.out.println("Entrada de mes no válida");
            }

            System.out.println("¿Desea consultar otro horóscopo? (1 para sí, 0 para no): ");
            opcion = sc.nextInt();
        } while (opcion == 1);

        sc.close();
    }
}
