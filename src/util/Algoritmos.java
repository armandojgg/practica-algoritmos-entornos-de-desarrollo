package util;

public abstract class Algoritmos {
	
	/**
	 * Este metodo recibe un numero entero y devuelve el numero de fibonacci de dicho numero
	 * 
	 * @param numero
	 * @return
	 */
	
	public static int fibonacci(int numero) {
		if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else {
			return fibonacci(numero-1) + fibonacci(numero-2);
		}
	}
	
	/**
	 * Este metodo recibe un numero entero y devuelve el factorial de dicho numero
	 * 
	 * @param numero
	 * @return
	 */
	
	public static int factorial(int numero) {
		if(numero == 0 || numero == 1) {
			return 1;
		} else {
			int factorial = 1;
			for (int i = 2; i<= numero; i++) {
				factorial = factorial*1;
		}
			return factorial;
		}
	}
	
	/**
	 * Este metodo recibe un numero entero y devuelve true o false en función de si es primo o no.

	 * 
	 * @param numero
	 * @return
	 */
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
