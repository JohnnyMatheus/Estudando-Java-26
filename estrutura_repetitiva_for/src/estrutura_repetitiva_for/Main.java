package estrutura_repetitiva_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros deseja digitar");
		int N = sc.nextInt();
		int soma =0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("RESULTADO "+ soma);
		sc.close();
	}

}
