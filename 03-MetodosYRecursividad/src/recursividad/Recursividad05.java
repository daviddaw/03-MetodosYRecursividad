package recursividad;

public class Recursividad05 {


	public static void main(String[] args) {
		int num;
		do{
			System.out.println("Introduce numero mayor o igual a 0");
			num=LeerTeclado.readInteger();
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