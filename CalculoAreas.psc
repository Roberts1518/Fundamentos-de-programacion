Algoritmo CalculoAreas
    Definir opcion Como Entero;
    Definir lado, base, altura, radio Como Real;
    Definir PI Como Real;
    PI <- 3.14159;
    
    Repetir
        Escribir "Men� de opciones:";
        Escribir "1. Cuadrado";
        Escribir "2. Rect�ngulo";
        Escribir "3. Tri�ngulo";
        Escribir "4. C�rculo";
        Escribir "5. Salir";
        Leer opcion;
        
        Segun opcion Hacer
            1:
                Escribir "Ingrese el lado del cuadrado: ";
                Leer lado;
                Escribir "El �rea del cuadrado es: ", lado * lado;
            2:
                Escribir "Ingrese la base del rect�ngulo: ";
                Leer base;
                Escribir "Ingrese la altura del rect�ngulo: ";
                Leer altura;
                Escribir "El �rea del rect�ngulo es: ", base * altura;
            3:
                Escribir "Ingrese la base del tri�ngulo: ";
                Leer base;
                Escribir "Ingrese la altura del tri�ngulo: ";
                Leer altura;
                Escribir "El �rea del tri�ngulo es: ", (base * altura) / 2;
            4:
                Escribir "Ingrese el radio del c�rculo: ";
                Leer radio;
                Escribir "El �rea del c�rculo es: ", PI * (radio * radio);
            5:
                Escribir "Saliendo del programa...";
        Fin Segun
    Hasta Que opcion = 5;
FinAlgoritmo