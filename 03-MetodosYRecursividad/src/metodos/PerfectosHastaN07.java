package metodos;

import scanner.ScannerJava;

public class PerfectosHastaN07 {

	public static void main(String[] args) {
		int n1;
		boolean perfecto=false;
		
		System.out.println("> numeros perfectos hasta N.");

		n1=ScannerJava.positivo();
	
		

	   System.out.println("Los numeros perfectos hasta "+n1+" son:");
		for (int i = 1; i <= n1; i++) 
		{
			if (sumaDivisores(i)==i) 
			{
				System.out.println(i);
				perfecto=true;
			}

		}
		if (perfecto==false) {
			System.out.println("no hay perfectos hasta  "+n1);
		}

		

		
	}
	public static int sumaDivisores(int n) {
		int acu=0,i;
		//System.out.println("los divisores son");
		for (i = 1; i <= n/2; i++) {
			if (n%i==0) {
				acu=acu+i;
			}		
		}
		return acu;
	}
}