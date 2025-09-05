Algoritmo Horoscopo
    Definir dia, mes Como Entero;
    
    Escribir "Ingrese el día de nacimiento: ";
    Leer dia;
    Escribir "Ingrese el mes de nacimiento (1-12): ";
    Leer mes;
    
    Si (mes = 1 y dia >= 20) o (mes = 2 y dia <= 18) Entonces
        Escribir "Acuario: Tu creatividad innovadora será clave hoy.";
    Sino
        Si (mes = 2 y dia >= 19) o (mes = 3 y dia <= 20) Entonces
            Escribir "Piscis: Confía en tu intuición y en tus sueños.";
        Sino
            Si (mes = 3 y dia >= 21) o (mes = 4 y dia <= 19) Entonces
                Escribir "Aries: Hoy es un día para tomar decisiones audaces. Confía en tu intuición.";
            Sino
                Si (mes = 4 y dia >= 20) o (mes = 5 y dia <= 20) Entonces
                    Escribir "Tauro: La paciencia será tu aliada hoy. Mantén la calma en situaciones difíciles.";
                Sino
                    Si (mes = 5 y dia >= 21) o (mes = 6 y dia <= 20) Entonces
                        Escribir "Géminis: Tu curiosidad te llevará a nuevas oportunidades. Explora y aprende.";
                    Sino
                        Si (mes = 6 y dia >= 21) o (mes = 7 y dia <= 22) Entonces
                            Escribir "Cáncer: Enfócate en tus emociones y en cuidar a tus seres queridos.";
                        Sino
                            Si (mes = 7 y dia >= 23) o (mes = 8 y dia <= 22) Entonces
                                Escribir "Leo: Tu carisma brilla hoy. Usa tu liderazgo para inspirar a otros.";
                            Sino
                                Si (mes = 8 y dia >= 23) o (mes = 9 y dia <= 22) Entonces
                                    Escribir "Virgo: La atención al detalle te ayudará a resolver problemas pendientes.";
                                Sino
                                    Si (mes = 9 y dia >= 23) o (mes = 10 y dia <= 22) Entonces
                                        Escribir "Libra: Busca el equilibrio en tus relaciones y decisiones.";
                                    Sino
                                        Si (mes = 10 y dia >= 23) o (mes = 11 y dia <= 21) Entonces
                                            Escribir "Escorpio: Tu intensidad te dará fuerza para superar obstáculos.";
                                        Sino
                                            Si (mes = 11 y dia >= 22) o (mes = 12 y dia <= 21) Entonces
                                                Escribir "Sagitario: La aventura te llama. Sal de tu zona de confort.";
                                            Sino
                                                Si (mes = 12 y dia >= 22) o (mes = 1 y dia <= 19) Entonces
                                                    Escribir "Capricornio: Tu disciplina te llevará al éxito. Sigue trabajando duro.";
                                                Sino
                                                    Escribir "Fecha inválida";
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