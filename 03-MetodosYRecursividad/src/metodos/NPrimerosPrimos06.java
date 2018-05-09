package metodos;
import scanner.ScannerJava;

public class NPrimerosPrimos06 {

	public static void main(String[] args) {
		int i=2,tope,contador=0;
		
		System.out.println("Escribe que numero  primos quieres");
		tope=ScannerJava.positivo();
	
		System.out.println("Estos son los "+tope+" primeros números primos  ");
		
		while(contador<tope) {
		
			
			if(NumeroPrimo04.esPrimo(i)==true) {
				System.out.println(i);
			contador++;
			}

			i++;
		}
			
		}
	}

