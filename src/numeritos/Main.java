package numeritos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables.
		Scanner sc = new Scanner(System.in);
		int numUsuario = 0; //Iniciamos la variable en 0.

		// Inicio del programa
		System.out.println("Inserta un número: ");
		try {
			numUsuario = Integer.parseInt(sc.nextLine());  //Solicitamos el número.
			int suma = numUsuario + 2; // Realizamos la suma
			System.out.println("El número dado es: " + numUsuario + ", pero si le sumas 2, se queda en " + suma); //Imprimimos por pantalla el número y la suma
		}catch (Exception e) { // Controlamos que el usuario no introduzca un dato no válido
			System.out.println("No has introducido un número válido.");
		}

	}

}
