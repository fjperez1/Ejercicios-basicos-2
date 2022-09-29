package ejercicios2;

import java.util.Scanner;

public class EjerciciosBasicos25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar

		int notasPrimerT, notasSegundoT, notasTercerT;
		double notaMedia;
		Scanner sc = new Scanner (System.in);

		//Solicitamos al usuario que nos indique la nota media de los distintos trimestres

		System.out.println ("Introduce las notas del primer trimestre");
		notasPrimerT = sc.nextInt();
		System.out.println ("Introduce las notas del segundo trimestre");
		notasSegundoT = sc.nextInt();
		System.out.println ("Introduce las notas del tercer trimestre");
		notasTercerT = sc.nextInt();

		//Realizamos los calculos necesarios y mostramos el resultado al usuario

		notaMedia = (double)(notasPrimerT+notasSegundoT+notasTercerT)/3;
		System.out.println ("La nota del boletin es " + (int)notaMedia);

		//Realizamos los calculos necesarios para mostrar la nota de expediente al usuario

		System.out.println ("La nota del expediente es " + notaMedia);
		sc.close();
	}

}

