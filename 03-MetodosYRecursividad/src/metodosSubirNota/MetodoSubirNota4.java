package metodosSubirNota;

import scanner.ScannerJava;

/**
 * 4.- Escribe un programa que convierta un n�mero en base 10 a binario (base 2). 
 * Para ello se invocar� a un m�todo al que le pasaremos el n�mero entero como par�metro 
 * y devolver� un String con el n�mero convertido a binario. Para convertir un n�mero decimal a binario, 
 * debemos dividir entre 2 el n�mero y el resultado de esa divisi�n se divide entre 2 de nuevo hasta que no se pueda dividir m�s, 
 * el resto que obtengamos de cada divisi�n formar� el n�mero binario, de abajo a arriba.
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
