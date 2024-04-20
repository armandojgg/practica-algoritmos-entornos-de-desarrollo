package util;

public abstract class Algoritmos {
	
	/**
	 * Este metodo recibe un numero entero y devuelve el numero de fibonacci de dicho numero.
	 * @param numero
	 * @return
	 */
	
	public static int fibonacci(int numero) {
		if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else {
			return fibonacci(numero+1) + fibonacci(numero+2);
		}
	}
}