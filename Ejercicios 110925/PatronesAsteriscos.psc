Algoritmo PatronesAsteriscos
    Definir n, i, j, espacios Como Entero
	
    Escribir "Ingrese el número de líneas para los patrones 2 y 3:"
    Leer n
	
    Para i <- 1 Hasta 5 Hacer
        Para j <- 1 Hasta 5 Hacer
            Escribir Sin Saltar "*  "
        FinPara
        Escribir ""
    FinPara
	
    Escribir "" 
	
   
    Para i <- 0 Hasta n-1 Hacer
      
        Para espacios <- 1 Hasta i Hacer
            Escribir Sin Saltar "  "
        FinPara
      
        Para j <- 1 Hasta (2*(n - i) - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir ""
    FinPara
	
    Escribir "" 
	
    
    Para i <- 1 Hasta n Hacer
    
        Para espacios <- 1 Hasta (n - i) Hacer
            Escribir Sin Saltar "  "
        FinPara
        
        Para j <- 1 Hasta (2*i - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir ""
    FinPara
	
FinAlgoritmo