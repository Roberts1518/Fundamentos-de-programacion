Algoritmo MesDias
    Definir mes Como Entero;
    
    Escribir "Ingrese el número del mes: ";
    Leer mes;
    
    Si mes < 1 O mes > 12 Entonces
        Escribir "Mes inválido";
    Sino
        Segun mes Hacer
            1, 3, 5, 7, 8, 10, 12:
                Escribir "El mes es de 31 días";
                Segun mes Hacer
                    1: Escribir "Enero";
                    3: Escribir "Marzo";
                    5: Escribir "Mayo";
                    7: Escribir "Julio";
                    8: Escribir "Agosto";
                    10: Escribir "Octubre";
                    12: Escribir "Diciembre";
                Fin Segun
            4, 6, 9, 11:
                Escribir "El mes es de 30 días";
                Segun mes Hacer
                    4: Escribir "Abril";
                    6: Escribir "Junio";
                    9: Escribir "Septiembre";
                    11: Escribir "Noviembre";
                Fin Segun
            2:
                Escribir "El mes es de 28 días";
                Escribir "Febrero";
        Fin Segun
    Fin Si
FinAlgoritmo