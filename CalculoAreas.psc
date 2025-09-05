Algoritmo CalculoAreas
    Definir opcion Como Entero;
    Definir lado, base, altura, radio Como Real;
    Definir PI Como Real;
    PI <- 3.14159;
    
    Repetir
        Escribir "Menú de opciones:";
        Escribir "1. Cuadrado";
        Escribir "2. Rectángulo";
        Escribir "3. Triángulo";
        Escribir "4. Círculo";
        Escribir "5. Salir";
        Leer opcion;
        
        Segun opcion Hacer
            1:
                Escribir "Ingrese el lado del cuadrado: ";
                Leer lado;
                Escribir "El área del cuadrado es: ", lado * lado;
            2:
                Escribir "Ingrese la base del rectángulo: ";
                Leer base;
                Escribir "Ingrese la altura del rectángulo: ";
                Leer altura;
                Escribir "El área del rectángulo es: ", base * altura;
            3:
                Escribir "Ingrese la base del triángulo: ";
                Leer base;
                Escribir "Ingrese la altura del triángulo: ";
                Leer altura;
                Escribir "El área del triángulo es: ", (base * altura) / 2;
            4:
                Escribir "Ingrese el radio del círculo: ";
                Leer radio;
                Escribir "El área del círculo es: ", PI * (radio * radio);
            5:
                Escribir "Saliendo del programa...";
        Fin Segun
    Hasta Que opcion = 5;
FinAlgoritmo