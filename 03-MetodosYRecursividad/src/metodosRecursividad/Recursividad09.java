package metodosRecursividad;
/**
 * Escribir un método que calcule el factorial de un nº usando recursividad
 * @author David Palanco
 *
 */
public class Recursividad09 {

	public static void main(String[] args) {
		System.out.println(calcFactorial(5));
	}
	
	public static int calcFactorial(int n) {

		
		if (n==0) {
			
			return 1;
		}else if (n==1) {
			System.out.println(" ");
			return 1;
		}else {
			int num =n*(calcFactorial(n-1));
			
			return num;
		}
			
		
		
		
		
	}

}
