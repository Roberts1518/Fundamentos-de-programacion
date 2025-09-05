	Algoritmo AlarmaDespertador
		Definir dia_semana Como Entero
		Definir vacaciones Como Logico
		Definir hora_alarma Como Caracter
		Escribir "Ingrese el día de la semana (0=Dom, 1=Lun, ..., 6=Sáb): "
		Leer dia_semana
		Escribir "¿Está de vacaciones? (Escriba Falso o Verdadero): "
		Leer vacaciones
		Si Logico Entonces
			Si dia_semana >= 1 Y dia_semana <= 5 Entonces
				hora_alarma <- "8:00"
			SiNo
				hora_alarma <- "off"
			FinSi
		SiNo
			Si dia_semana >= 1 Y dia_semana <= 5 Entonces
				hora_alarma <- "6:00"
			SiNo
				hora_alarma <- "9:00"
			FinSi
		FinSi
		Escribir "La alarma debe sonar a las ", hora_alarma
		
FinAlgoritmo
