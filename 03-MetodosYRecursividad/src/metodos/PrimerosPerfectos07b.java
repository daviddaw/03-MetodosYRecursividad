package metodos;

import scanner.ScannerJava;
/**
 * 7.	Escribir un m�todo que reciba por par�metro un n� y devuelva la suma de sus divisores, salvo �l mismo. 
 * Utilizando este m�todo, escribir un main para obtener todos los n�meros perfectos menores que un N introducido por teclado
 * @author David Palanco
 *
 */
public class PrimerosPerfectos07b {

	public static void main(String[] args) {
		double tope,i=1;
		int contador=0;
		System.out.println("Dame un numero positivo ");
		tope=ScannerJava.positivoDouble();
		
		while(contador<tope) {
			
		if (i==numperfectos(i)) {
			
			System.out.println(numperfectos(i));
			contador++;
		}
	

		

		
		i++;
		System.out.println(i+"no");
		//System.out.println(i);
		}

	}
	
	public static double numperfectos(double n) {
		double suma=0;
		//for (int i = 1; i < n/2; i++) {
		for (double i = 1; i <= n/2; i++) {
			if (n%i==0) {
			 suma = suma+i;
			}
				 }
		
		
		return suma;
	}

}
