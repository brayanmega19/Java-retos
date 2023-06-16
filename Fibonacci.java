package Ejercicios;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//El siguiente programa es la serie de fibonacci
		Scanner entry = new Scanner(System.in);
		int suma = 0, primero = 1, segundo = 0;
		
		System.out.println("Introduzca el numero de sucesiones que busca");
		int sucesiones = entry.nextInt();
		
		for(int i=0; i<sucesiones; i++) {
			
			System.out.println(suma);
			
			segundo = primero;
			primero = suma;
			suma = segundo + primero;
			
		}
	}
	
	
	
	

}
