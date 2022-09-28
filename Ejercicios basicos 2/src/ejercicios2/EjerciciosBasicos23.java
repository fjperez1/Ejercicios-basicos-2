package ejercicios2;

import java.util.Scanner;

public class EjerciciosBasicos23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Declaramos las variables que vamos a utilizar
		
			int numero;
			Scanner lectura = new Scanner(System.in);
			
			//Solicitamos un numero al usuario
			
			System.out.println("Introduce un número para saber si es par o no");
			numero = lectura.nextInt();
			
			//Mostramos el resultado en pantalla
			
			System.out.println((numero%2)==0);
	}

}
