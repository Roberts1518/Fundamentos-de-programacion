Algoritmo Horoscopo
    Definir dia, mes Como Entero;
    
    Escribir "Ingrese el d�a de nacimiento: ";
    Leer dia;
    Escribir "Ingrese el mes de nacimiento (1-12): ";
    Leer mes;
    
    Si (mes = 1 y dia >= 20) o (mes = 2 y dia <= 18) Entonces
        Escribir "Acuario: Tu creatividad innovadora ser� clave hoy.";
    Sino
        Si (mes = 2 y dia >= 19) o (mes = 3 y dia <= 20) Entonces
            Escribir "Piscis: Conf�a en tu intuici�n y en tus sue�os.";
        Sino
            Si (mes = 3 y dia >= 21) o (mes = 4 y dia <= 19) Entonces
                Escribir "Aries: Hoy es un d�a para tomar decisiones audaces. Conf�a en tu intuici�n.";
            Sino
                Si (mes = 4 y dia >= 20) o (mes = 5 y dia <= 20) Entonces
                    Escribir "Tauro: La paciencia ser� tu aliada hoy. Mant�n la calma en situaciones dif�ciles.";
                Sino
                    Si (mes = 5 y dia >= 21) o (mes = 6 y dia <= 20) Entonces
                        Escribir "G�minis: Tu curiosidad te llevar� a nuevas oportunidades. Explora y aprende.";
                    Sino
                        Si (mes = 6 y dia >= 21) o (mes = 7 y dia <= 22) Entonces
                            Escribir "C�ncer: Enf�cate en tus emociones y en cuidar a tus seres queridos.";
                        Sino
                            Si (mes = 7 y dia >= 23) o (mes = 8 y dia <= 22) Entonces
                                Escribir "Leo: Tu carisma brilla hoy. Usa tu liderazgo para inspirar a otros.";
                            Sino
                                Si (mes = 8 y dia >= 23) o (mes = 9 y dia <= 22) Entonces
                                    Escribir "Virgo: La atenci�n al detalle te ayudar� a resolver problemas pendientes.";
                                Sino
                                    Si (mes = 9 y dia >= 23) o (mes = 10 y dia <= 22) Entonces
                                        Escribir "Libra: Busca el equilibrio en tus relaciones y decisiones.";
                                    Sino
                                        Si (mes = 10 y dia >= 23) o (mes = 11 y dia <= 21) Entonces
                                            Escribir "Escorpio: Tu intensidad te dar� fuerza para superar obst�culos.";
                                        Sino
                                            Si (mes = 11 y dia >= 22) o (mes = 12 y dia <= 21) Entonces
                                                Escribir "Sagitario: La aventura te llama. Sal de tu zona de confort.";
                                            Sino
                                                Si (mes = 12 y dia >= 22) o (mes = 1 y dia <= 19) Entonces
                                                    Escribir "Capricornio: Tu disciplina te llevar� al �xito. Sigue trabajando duro.";
                                                Sino
                                                    Escribir "Fecha inv�lida";
                                                Fin Si
                                            Fin Si
                                        Fin Si
                                    Fin Si
                                Fin Si
                            Fin Si
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
        Fin Si
    Fin Si
FinAlgoritmo