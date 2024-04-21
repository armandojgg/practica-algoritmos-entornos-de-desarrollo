package app;

import java.util.Random;
import util.Algoritmos;

public class Principal {
	
	public static void main(String[] args) {
		
	/**
	 * Crea mediante un bucle un array de enteros llamado “numeros” con 5 números aleatorios del 1 al 10
	 */
	
	int[] numeros = new int[5];
	
	/**
	 * Genera numeros random.
	 */
	
	Random random = new Random();
	
	/**
	 * Con un for llenamos el array con numeros aleatorios del 1 al 10.
	 */
	
	for (int i = 0; i < numeros.length; i++) {
        numeros[i] = random.nextInt(10) + 1;
    	}
	
	}	
}
