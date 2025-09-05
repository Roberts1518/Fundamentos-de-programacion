import java.util.Scanner;

public class Horoscopo{

public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su día de nacimiento");
        int dia=sc.nextInt();
        System.out.println("Ingrese el numero de mes de su nacimiento (1-12))");
        int mes=sc.nextInt();
        switch(mes){

            case 1:

                if(dia>=1&& dia<=19){
                  System.out.println("Su signo es Capricornio ");

                }else if(dia>=20 && dia<=31){
                  System.out.println("Su signo es Acuario");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;

            case 2:

                if(dia>=1&& dia<=18){
                  System.out.println("Su signo es Acuario ");

                }else if(dia>=19 && dia<=29){
                  System.out.println("Su signo es Piscis");
                }else{
                 System.out.println("Día no valido");
                }
                break;

            case 3:

                if(dia>=1 && dia<=20){
                  System.out.println("Su signo es piscis ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Aries");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;

            case 4:

                if(dia>=1&& dia<=19){
                  System.out.println("Su signo es Aries");

                }else if(dia>=20 && dia<=30){
                  System.out.println("Su signo es Tauro");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 

            case 5:

                if(dia>=1&& dia<=20){
                  System.out.println("Su signo es Tauro ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Geminis");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;  

            case 6:

                if(dia>=1&& dia<=20){
                  System.out.println("Su signo es Geminis ");

                }else if(dia>=21 && dia<=31){
                  System.out.println("Su signo es Cancer");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 

            case 7:

                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Cancer ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Leo");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;

            case 8:

                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Leo ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Virgo");
                }else{
                 System.out.println("Día no valido");
                }
              
                break; 

            case 9:

                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Virgo");

                }else if(dia>=23 && dia<=30){
                  System.out.println("Su signo es Libra");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;       

             case 10:

                if(dia>=1&& dia<=22){
                  System.out.println("Su signo es Libra ");

                }else if(dia>=23 && dia<=31){
                  System.out.println("Su signo es Escorpio");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;

            case 11:

                if(dia>=1&& dia<=21){
                  System.out.println("Su signo es Escorpio ");

                }else if(dia>=22 && dia<=30){
                  System.out.println("Su signo es Sagitario");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;  

            case 12:

                if(dia>=1&& dia<=21){
                  System.out.println("Su signo es Sagitario");

                }else if(dia>=22 && dia<=31){
                  System.out.println("Su signo es Capricornio");
                }else{
                 System.out.println("Día no valido");
                }
              
                break;                
            default:
                  System.out.println("entrada de mes no valida");
                
                
        }
     }
    }