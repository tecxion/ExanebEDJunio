package numeritos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables.
		Scanner sc = new Scanner(System.in);
		int numUsuario = 0; //Iniciamos la variable en 0.
		
		System.out.println("Inserta un número: ");
		try {
			numUsuario = Integer.parseInt(sc.nextLine());
			int suma = numUsuario + 2;
			System.out.println("El número dado es: " + numUsuario + ", pero si le sumas 2, se queda en " + suma);
		}catch (Exception e) {
			System.out.println("No has introducido un número válido.");
		}
		
		
		
		
		
		

	}

}
