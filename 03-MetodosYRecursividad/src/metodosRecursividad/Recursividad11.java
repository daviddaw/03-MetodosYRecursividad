package metodosRecursividad;

import recursividad.LeerTeclado;

public class Recursividad11 {
/*11.	Escribir un programa que dado un número N 
	 * calcule los N primeros números de la serie de Fibonacci usando recursividad:
an= an-1 + an-2
	 *0 a1=0
	 *1 a2=1
	 *2 a3=1+0=1
	 *3 a4=1+1=2
	 *4 a5=2+2=3
	 *5 a6=3+2=5
	 *6 a7=5+3=8
	 *7 a8=
	 * */
	public static void main(String[] args) {
		int n;
		System.out.println("escribe");
		n=LeerTeclado.readInteger();
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i));
		}
		

		}
	public static int fibonacci(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
			
		return fibonacci(n-1)+fibonacci(n-2);
		
		
		
	}

}
