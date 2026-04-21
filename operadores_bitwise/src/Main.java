import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPERADORES BITWISE
		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		
		//TESTAR 6 BIT DO NUMERO N VALE 1
		
	
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		System.out.println("Informe um numero: ");
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6° bit É VERDADEIRO");
		} else {
			System.out.println("6° bit É FALSO");
		}
		

		sc.close();
	}
}
