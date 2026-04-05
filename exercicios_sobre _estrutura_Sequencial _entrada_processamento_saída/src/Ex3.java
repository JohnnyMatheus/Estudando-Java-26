import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
//diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, DIFERENCA;
		System.out.println("Informe valor de A: ");
		A = sc.nextInt();
		System.out.println("Informe valor de B: ");
		B = sc.nextInt();
		System.out.println("Informe valor de C: ");
		C = sc.nextInt();
		System.out.println("Informe valor de D: ");
		D = sc.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.printf("DIFERENCA = %d", DIFERENCA);
		
		
	}

}
