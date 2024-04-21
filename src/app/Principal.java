package app;

import java.util.Random;
import util.Algoritmos;

public class Principal extends Algoritmos {
	
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
	
	/**
	 * Creamos un nuevo array que almacenara los resultados de Fibonacci.
	 * 
	 */
	
	int[] resultadoFibonacci = new int[numeros.length];
	
	/**
	 * Creamos un bucle for para calcular Fibonacci de cada número en el array numeros.
	 * 
	 */
	
	for (int i = 0; i < numeros.length; i++) {
        resultadoFibonacci[i] = fibonacci(numeros[i]);
    	}
	
	/**
	 * Creamos un nuevo array que almacenara resultados factorial.
	 * 
	 */
	
	int[] resultadoFactorial = new int[numeros.length];
	
	/**
	 * Bucle for, que lo que hara, sera calcular el factorial de cada numero en el array numeros.
	 * 
	 */
	for (int i = 0; i < numeros.length; i++) {
        resultadoFactorial[i] = factorial(numeros[i]);
    	}
	
	/**
	 * Creamos un nuevo array que inicializara resultados primos.
	 * 
	 */
	
		boolean[] resultadoPrimos = new boolean[numeros.length];
		
	/**
	 * Bucle for que comprueba si cada numero en el array es primo o no lo es.
	 * 	
	 */
		
		for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = esPrimo(numeros[i]);
        }
		
	}	
}
