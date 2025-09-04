import java.util.Scanner;

public class Fabrica {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double costodeproduccion;
		double gastosdefabricacion = 0.0;
		double manodeobra = 0.0;
		double materiaprima;
		double preciodeventa;
		int respuesta;
		System.out.println(" Teclea el  numero de articulo que deseas calcular, (1,2,3,4,5,6)");
		respuesta = scanner.nextInt();
		System.out.println("Teclea el costo de la materia prima");
		materiaprima = scanner.nextDouble();
		if (respuesta==3) {
			manodeobra = .75*materiaprima;
			gastosdefabricacion = .35*materiaprima;
		} else {
			if (respuesta==4) {
				manodeobra = .75*materiaprima;
				gastosdefabricacion = .28*materiaprima;
			} else {
				if (respuesta==1) {
					manodeobra = .80*materiaprima;
					gastosdefabricacion = .28*materiaprima;
				} else {
					if (respuesta==5) {
						manodeobra = .80*materiaprima;
						gastosdefabricacion = .30*materiaprima;
					} else {
						if (respuesta==2) {
							manodeobra = .85*materiaprima;
							gastosdefabricacion = .30*materiaprima;
						} else {
							if (respuesta==6) {
								manodeobra = .85*materiaprima;
								gastosdefabricacion = .35*materiaprima;
							}
						}
					}
				}
			}
		}
		costodeproduccion = materiaprima+manodeobra+gastosdefabricacion;
		preciodeventa = costodeproduccion+(.45*costodeproduccion);
		System.out.println(preciodeventa);
	}


}

