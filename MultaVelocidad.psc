Algoritmo MultaVelocidad
	
	Escribir "Es tu cumple�os?"
	Escribir "1 para Si, 2 para No"
	Leer Cumplea�os
	
	Si Cumplea�os = 1 Entonces
		Escribir "No hay multa"
	SiNo
		Escribir "Introduce tu velocidad"
		Leer Velocidad
		Si Velocidad <= 60 Entonces
			Escribir "No hay multa"
			Sino Si (Velocidad >= 60) & (Velocidad <= 80) Entonces
				Escribir "Multa Peque�a"
					Sino Si Velocidad >= 80 Entonces
					Escribir "Multa Grande"
					
				FinSi
			FinSi
			
		Fin Si
		
	Fin Si
	
FinAlgoritmo
