package Ejercicios;

import java.util.Scanner;

public class OrdenarArreglo {

	public static void main(String[] args) {
		//El siguiente algoritmo ordena un arreglo
		Scanner entry = new Scanner(System.in);
		int sustituir = 0;
		System.out.println("Introduce el numero de elementos del algoritmo");
		
		int longitud = entry.nextInt();
		int[] arreglo = new int[longitud];
		
		for(int i=0; i<arreglo.length; i++) {
			arreglo[i] = entry.nextInt();
		}		
		for(int n=0; n<arreglo.length-1; n++) {
			for(int i=0; i<arreglo.length-1-n; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					sustituir = arreglo[i+1];
					arreglo[i+1] = arreglo[i];
					arreglo[i] = sustituir;
				};
					
			}
		}
		for(int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}

}
