package ejercicios2;

import java.util.Scanner;

public class EjerciciosBasicos24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean llueve;
		boolean tareas;
		boolean biblio;
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("¿Llueve?");
		llueve = lectura.nextBoolean();
		
		System.out.println("¿Has finalizado tus tareas?");
		tareas = lectura.nextBoolean();
		
		System.out.println("¿Necesitas ir a la biblioteca?");
		biblio = lectura.nextBoolean();
		
				
		System.out.println(((!llueve && tareas) || biblio) ? "Si puedes salir":"No puedes salir");

	}

}