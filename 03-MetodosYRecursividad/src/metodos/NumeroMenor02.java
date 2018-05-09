package metodos;

import scanner.ScannerJava;

/**
 * 2.	Escribir un método que reciba como parámetros dos números y devuelva el menor de los dos. 
 * Si son iguales, devolverá uno de ellos.
 * @author David Palanco
 *
 */
public class NumeroMenor02 {

	public static void main(String[] args) {
		int  a=1,b=2;
		a=ScannerJava.entero();
		b=ScannerJava.entero();
		System.out.println(menor(a, b));

	}
    public static int menor(int a,int b) {
    	int n1=a,n2=b;
		if (n1>n2) {
			return n2;
		}else if (n1==n2) {
			return n1;
		} else 
			return n1;
		
		

	}
}
