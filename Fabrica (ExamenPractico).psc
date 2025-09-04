Algoritmo Fabrica
	Escribir " Teclea el  numero de articulo que deseas calcular, (1,2,3,4,5,6): "
	Leer Respuesta
	
	Escribir "Teclea el costo de la materia prima: "
	Leer MateriaPrima
	
	
		Si Respuesta = 3 Entonces
			ManoDeObra = .75 * MateriaPrima
			GastosDeFabricacion = .35 * MateriaPrima
			Sino si Respuesta = 4 Entonces
					ManoDeObra = .75 * MateriaPrima
					GastosDeFabricacion = .28 * MateriaPrima
				SiNo Si Respuesta = 1 Entonces
						ManoDeObra = .80 * MateriaPrima
						GastosDeFabricacion = .28 * MateriaPrima
					Sino si Respuesta = 5 Entonces
							ManoDeObra = .80 * MateriaPrima
							GastosDeFabricacion = .30 * MateriaPrima
						SiNo Si Respuesta = 2 Entonces
								ManoDeObra = .85 * MateriaPrima
								GastosDeFabricacion = .30 * MateriaPrima
							SiNo Si Respuesta = 6 Entonces
									ManoDeObra = .85 * MateriaPrima
									GastosDeFabricacion = .35 * MateriaPrima
							
							Finsi
						Finsi
					Fin Si
				FinSi		
			FinSi
		Fin Si

CostoDeProduccion = MateriaPrima + ManoDeObra + GastosDeFabricacion

PrecioDeVenta = CostoDeProduccion + (.45 * CostoDeProduccion)

Escribir PrecioDeVenta



FinAlgoritmo