package Ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		HashSet<Integer> grupo = new HashSet<Integer>();
		int[] arreglo = new int[9];
		
		//A continuación se va a introducir un número el cual va a cambiar su formato a cadena de texto
		//Y en caso de contener un numero 7 este numero va ser indicado;
		
		System.out.println("LLenar arreglo");
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(1+i+".- ");
			arreglo[i] = entry.nextInt();
		}
		
		for(int i: arreglo) {
			Object fetch_number = i;
			String string_number = fetch_number.toString();
			String[] array_string = string_number.split("");
			
			for(String n: array_string) {
				if(n.equals("7")) grupo.add(i);
				
			}
			
		}
		
		for(Integer i: grupo) {
			System.out.print("["+i+"] ");
		}
		
		//Object object_number = (Object)number;
		

		
		
		
		

		


	}

}
