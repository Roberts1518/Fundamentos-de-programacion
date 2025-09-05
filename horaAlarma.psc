Algoritmo HoraAlarma
    // Definición de variables
    Definir diaSemana Como Entero
    Definir respuesta Como Caracter
    Definir deVacaciones Como Logico
    Definir horaAlarma Como Caracter
	
    // Solicitar al usuario el día de la semana
    Escribir "Ingresa el día de la semana (0=Domingo, 1=Lunes, 2=Martes, 3=Miércoles, 4=Jueves, 5=Viernes, 6=Sábado):"
    Leer diaSemana
	
    // Solicitar si está de vacaciones
    Escribir "¿Estás de vacaciones? (si/no):"
    Leer respuesta
	
    // Convertir la respuesta a un valor lógico
    deVacaciones <- (respuesta = "si")
	
    // Lógica para determinar la hora de la alarma
    Si deVacaciones Entonces
        Segun diaSemana Hacer
            0:
                horaAlarma <- "desactivado"
            6:
                horaAlarma <- "desactivado"
            De Otro Modo:
                horaAlarma <- "8:00"
        FinSegun
    SiNo
        Segun diaSemana Hacer
            0:
                horaAlarma <- "9:00"
            6:
                horaAlarma <- "9:00"
            De Otro Modo:
                horaAlarma <- "6:00"
        FinSegun
    FinSi
	
    // Mostrar el resultado final
    Escribir "La alarma debe sonar a las: ", horaAlarma
FinAlgoritmo