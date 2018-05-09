package metodosSubirNota;

import scanner.ScannerJava;

public class MetodoSubirNota3 {
/**
 * 3.- La notaci�n prefija representa una operaci�n aritm�tica mostrando primero el operador y luego los operandos (Ejemplo + 3 5). Se pide crear un programa llamado NotacionPrefija que  pida en este orden  un signo aritm�tico (String) y 2 operandos  num�ricos, que invoque a un m�todo que reciba estos datos como par�metros  y que devuelva el resultado de  la operaci�n correspondiente. Este resultado  se recoger� y se imprimir� en el main. 
Los signos aritm�ticos disponibles son:
�	+: suma los dos operandos. 
�	-: resta los operandos. 
�	*: multiplica los operandos. 
�	/: divide los operandos, este debe dar un resultado con decimales  
�	^: 1� operando como base y 2� como exponente. 
�	%: m�dulo, resto de la divisi�n entre operando1 y operando2. 

 *
 */
	public static void main(String[] args) {
		String simbolo;
		int n1,n2;
		
		System.out.println("Escribe el simbolo del operando que quieras utilizar"+
	"\n  +: suma los dos operandos."+
	"\n  -: resta los dos operandos."+
	"\n  *: multiplica los operandos."+
	"\n  /: divide los dos operandos."+
	"\n  ^: 1� operando como base y 2� como exponente."+
	"\n  %: hace el resto de la divisi�n entre el operando1 y el  operando2.");
		simbolo=ScannerJava.Simbolo();
		System.out.println("Primer operando");
		n1=ScannerJava.entero();
		System.out.println("segundo operando");
		n2=ScannerJava.entero();
		System.out.println(simbolo+" "+n1+" "+n2);
		switch (simbolo) {
		case "+":System.out.println("La suma es "+suma(n1, n2)); break;
		case "-":System.out.println("La resta es "+resta(n1, n2)); break;
		case "*":System.out.println("La multiplicacion es "+multi(n1, n2)); break;
		case "/":System.out.println("La division es "+divi(n1, n2)); break;
		case "^":System.out.println("La potencia es "+potencia(n1, n2)); break;
		case "%":System.out.println("El resto es "+resto(n1, n2)); break;
		default: ;break;
		}


		

	}
	
	public static int resto(int n1, int n2) {
	
	return n1%n2;
}

	public static double potencia(int n1, int n2) {
	
	return Math.pow(n1, n2);
}

	public static double divi(int n1, int n2) {

	return (double)n1/n2;
}

	public static int multi(int n1, int n2) {
	
		return n1*n2;
}

	public static int resta(int n1, int n2) {

	return n1-n2;
}

	public static int suma(int a,int b) {
		return a+b;
		
	}

}
