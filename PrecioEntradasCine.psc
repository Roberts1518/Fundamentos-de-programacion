Algoritmo PrecioEntradasCine
    Definir numPersonas, diaSemana, tieneMembresia Como Entero;
    Definir precioTotal, numParejas, numIndividuales Como Real;
    
    Escribir "Ingrese el número de personas: ";
    Leer numPersonas;
    Escribir "Ingrese el día de la semana (1-7, donde 1 es lunes y 7 es domingo): ";
    Leer diaSemana;
    Escribir "¿Tiene membresía? (1 para sí, 0 para no): ";
    Leer tieneMembresia;
    
    Si diaSemana = 3 Entonces
        precioTotal <- numPersonas * 30;
    Sino
        Si diaSemana = 4 Entonces
            numParejas <- Trunc(numPersonas / 2);
            numIndividuales <- numPersonas MOD 2;
            precioTotal <- numParejas * 75 + numIndividuales * 50;
        Sino
            precioTotal <- numPersonas * 50;
        Fin Si
    Fin Si
    
    Si tieneMembresia = 1 Entonces
        precioTotal <- precioTotal * 0.9;
    Fin Si
    
    Escribir "El precio total es: ", precioTotal;
FinAlgoritmo