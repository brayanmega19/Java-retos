package Ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		HashSet<String> grupo = new HashSet<String>();
		HashSet<String> grupo2 = new HashSet<String>();
		
		System.out.println("Programando un anagrama");
		System.out.print("Introducir la primera palabra: ");
		String palabra1 = entry.nextLine();
		System.out.print("Introducir la segunda palabra: ");
		String palabra2 = entry.nextLine();
		
		if(palabra1.length() == palabra2.length()) {
			String[] palabra1Arreglo = palabra1.split("");
			String[] palabra2Arreglo = palabra2.split("");
			for(String i: palabra1Arreglo) {
				grupo.add(i);
			}
			for(String i: palabra2Arreglo) {
				grupo2.add(i);
			}
			System.out.println(grupo);
			System.out.println(grupo2);
			if(grupo.equals(grupo2)) System.out.println("Son palindromos");
			
		}else {
			System.out.println("Las palabras no es un palindromo");
		}
		
		
		
		
		
//		System.out.println(grupo);
//		System.out.println(grupo.size());
	}
	

}
