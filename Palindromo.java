package Ejercicios;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		System.out.println("Programando un palindromo");
		
		System.out.print("Introduce la palabra que se va a analizar si es un palindromo:");
		String palabra = entry.nextLine();
		String palabraInvertida = palindromo(palabra);
		System.out.println(palabraInvertida);
		if(palabra.equals(palabraInvertida)) System.out.println("Es un palindromo");
		else System.out.println("No es un palindromo");
		
		
	}
	public static String palindromo(String palabra) {
		String palabraInvertida = "";
		for(int i=palabra.length()-1; i>=0; i--) {
				palabraInvertida += palabra.charAt(i);
		}
		return palabraInvertida;
	}

}
