package ejercicios2;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosBasicos21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		double kilosManz1;
		double kilosPera1;
		double kilosManz2;
		double kilosPera2;
		final double precioManz;
		final double precioPera;
		Scanner lectura = new Scanner(System.in);

		
		//Solicitamos al usuario que nos indique la cantidad de Manzanas que ha vendido en kilos
		
		System.out.print("Introduce la cantidad de manzanas ventidad (en kilos) del primer semestre");
		kilosManz1 = lectura.nextDouble();
		System.out.print("Introduce la cantidad de manzanas ventidad (en kilos) del segundo semestre");
		kilosManz2 = lectura.nextDouble();
		
		//Solicitamos al usuario que nos indique la cantidad de Peras que ha vendido en kilos
		
		System.out.print("Introduce la cantidad de peras ventidad (en kilos) del primer semestre");
		kilosPera1 = lectura.nextDouble();
		System.out.print("Introduce la cantidad de peras ventidad (en kilos) del segundo semestre");
		kilosPera2 = lectura.nextDouble();
		
		//Realizamos los calculos necesarios para mostrar el usuario los resultados
		
		kilosManz1 *= 2.35;
		kilosManz2 *= 2.35;
		kilosPera1 *= 1.95;
		kilosPera2 *= 1.95;
		
		//Mostramos el resultado al cliente
		
		System.out.println("La cantidad introducida de manzanas es igual a " + (kilosManz1+kilosManz2) + " euros este año");
		System.out.println("La cantidad introducida de peras es igual a " + (kilosPera1+kilosPera2) + " euros este año");

	}

}

