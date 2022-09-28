package ejercicios2;

import java.util.Scanner;

public class EjerciciosBasicos25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		double nprim = 0.0;
		double nseg = 0.0;
		double nter = 0.0;
		double media = 0.0;
		Scanner lectura = new Scanner(System.in);
		
		//Solicitamos al usuario que introduzca las notas
		
		System.out.println("Introduce las notas del primer trimestre");
		nprim = lectura.nextDouble();
		System.out.println("Introduce las notas del segundo trimestre");
		nseg = lectura.nextDouble();
		System.out.println("Introduce las notas del tercer trimestre");
		nter = lectura.nextDouble();
		
		//Realizamos la media aritmética de las 3 notas
		
		media = (nprim + nseg + nter)/3;
		
		//Mostramos los resultados al usuario
		
		System.out.println("La nota media en boletín es " + (int)media);
	    System.out.format("La nota media en expediente es %.2f", media);
	
	}

}