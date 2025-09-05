Algoritmo SaludoPorHora
    Definir hora Como Entero;
    
    Escribir "Ingrese la hora (en formato 24 horas): ";
    Leer hora;
    
    Si hora >= 6 y hora <= 12 Entonces
        Escribir "Buenos días";
    Sino
        Si hora >= 13 y hora <= 20 Entonces
            Escribir "Buenas tardes";
        Sino
            Si hora >= 21 o hora <= 5 Entonces
                Escribir "Buenas noches";
            Fin Si
        Fin Si
    Fin Si
FinAlgoritmo