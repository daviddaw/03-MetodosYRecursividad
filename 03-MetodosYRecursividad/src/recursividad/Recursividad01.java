package recursividad;

public class Recursividad01 {
/*
9.	Escribir un método que calcule el factorial de un nº usando recursividad.
*/
	public static void main(String[] args) {
		int n;
		System.out.println("escribe");
		n=LeerTeclado.readInteger();
		System.out.println(factorialRecursivo(n));
		

	}
	public static double factorialRecursivo(int n) {
		System.out.println("n vale "+n);
		
		if (n==0) {
			System.out.println("vuelta");
			return 1;
		}
		else{
			System.out.println("bajando n="+n);
			System.out.println("resultado del factorial "+n*(factorialRecursivo(n-1)));
			
			return n*(factorialRecursivo(n-1));
			
		}
	
		
		
	}

}
