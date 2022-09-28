package ejercicios2;

import java.util.Scanner;

public class EjerciciosBasicos22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int edad;
		Scanner lectura = new Scanner(System.in);
		
		//Solicitamos al usuario que nos indique su edad
		
		System.out.print("Introduce tu edad guap@");
		edad = lectura.nextInt();
		
		//Mostramos el resultado en pantalla
		
		System.out.println(edad>=18);

	}

}