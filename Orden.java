package Ejercicios;

import java.util.Scanner;

public class Orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se introducira una serie de numeros y se determinaran los tres mas grandes
		
		int primero = 0, segundo = 0, tercero = 0;
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros a utilizar");
		int cantidadNumeros = entry.nextInt();
		
		for(int i=0; i<cantidadNumeros; i++) {
			System.out.print("Introduce el primer numero de la jerarquia: ");
			int numero = entry.nextInt();
			
			if(numero > primero) {tercero = segundo; segundo = primero; primero = numero;}
			else if(numero > segundo) { tercero = segundo; segundo = numero;}
			else if(numero > tercero) {tercero = numero;}
			
			
	}
		System.out.println("El orden jerarquico es\n 1.-"+primero+"\n2.-"+segundo+"\n3.-"+tercero);
			
			
		
		
		
 }
	
	

}
