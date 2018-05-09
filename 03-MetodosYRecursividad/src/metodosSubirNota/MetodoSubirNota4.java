package metodosSubirNota;

import scanner.ScannerJava;

/**
 * 4.- Escribe un programa que convierta un número en base 10 a binario (base 2). 
 * Para ello se invocará a un método al que le pasaremos el número entero como parámetro 
 * y devolverá un String con el número convertido a binario. Para convertir un número decimal a binario, 
 * debemos dividir entre 2 el número y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir más, 
 * el resto que obtengamos de cada división formará el número binario, de abajo a arriba.
 * @author David Palanco
 *
 */
public class MetodoSubirNota4 {

	public static void main(String[] args) {
		int n;
		System.out.println("escribe un numero");
		n=ScannerJava.entero();
		System.out.println();
		decimalBinario(n);
	}
	public static String decimalBinario(int n) {
		int cociente=n,resto;
		String cadena = "0";
		while (cociente>=2) {
			cociente=cociente/2;
			resto=cociente/2;
			
			System.out.println(cociente);
			
			cadena=cadena+resto;
			
		}
		System.out.print(cadena);
		
		
		return cadena;
		
	}
	

}
