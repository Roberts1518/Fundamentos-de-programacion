Algoritmo Tablas
    Repetir
        Escribir "Ingrese un número para generar su tabla de multiplicar (0 para salir):"
        Leer n
        Si n <> 0 Entonces
            Para i desde 1 hasta 10 hacer
                resultado = n * i
                Escribir n, " x ", i, " = ", resultado
            Fin Para
        Fin Si
    Hasta que n = 0
    Escribir "Programa terminado."
FinAlgoritmo
