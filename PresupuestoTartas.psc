Algoritmo PresupuestoTartas
    Definir sabor, tipoChocolate, snack, personalizacion Como Cadena;
    Definir precioTarta, precioTotal Como Real;
    
    Escribir "Ingrese el sabor de la tarta (manzana, fresa o chocolate): ";
    Leer sabor;
    
    Si sabor = "manzana" Entonces
        precioTarta <- 200;
    Sino
        Si sabor = "fresa" Entonces
            precioTarta <- 250;
        Sino
            Si sabor = "chocolate" Entonces
                Escribir "Ingrese el tipo de chocolate (negro o blanco): ";
                Leer tipoChocolate;
                Si tipoChocolate = "negro" Entonces
                    precioTarta <- 280;
                Sino
                    Si tipoChocolate = "blanco" Entonces
                        precioTarta <- 300;
                    Sino
                        Escribir "Tipo de chocolate inválido";
                        precioTarta <- 0;
                    Fin Si
                Fin Si
            Sino
                Escribir "Sabor inválido";
                precioTarta <- 0;
            Fin Si
        Fin Si
    Fin Si
    
    Escribir "¿Desea agregar snack? (si/no): ";
    Leer snack;
    Escribir "¿Desea personalizar con un nombre? (si/no): ";
    Leer personalizacion;
    
    precioTotal <- precioTarta;
    Si snack = "si" Entonces
        precioTotal <- precioTotal + 25;
    Fin Si
    Si personalizacion = "si" Entonces
        precioTotal <- precioTotal + 30;
    Fin Si
    
    Escribir "El precio total es: ", precioTotal;
FinAlgoritmo