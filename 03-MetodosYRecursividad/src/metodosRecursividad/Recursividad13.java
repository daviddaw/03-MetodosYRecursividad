package metodosRecursividad;

import scanner.ScannerJava;

public class Recursividad13 {

	public static void main(String[] args) {
		int num;
		do{
			System.out.println("Introduce numero mayor o igual a 0");
			num=ScannerJava.entero();
		}
		while (num<0);
		System.out.println("Las cifras en orden inverso son ");
		cifra(num);
	}
	
	public static void cifra(int n){
		if (n<10)
			System.out.print(n);
		else{
			System.out.print(n%10);
			cifra(n/10);			
		}
	}
}