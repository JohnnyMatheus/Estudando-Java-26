import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

		Scanner sc = new Scanner(System.in);
		int codigoPeca1, codigoPeca2,numPeca1, numPeca2;
		double valorUni1, valorUni2;
		Locale.setDefault(Locale.US);
		System.out.println("Informe o código da peça1: ");
		codigoPeca1 = sc.nextInt();
		System.out.println("Informe o número de peças 1");
		numPeca1 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça 1: ");
		valorUni1 = sc.nextDouble();
		
		System.out.println("Informe o código da peça2: ");
		codigoPeca2 = sc.nextInt();
		System.out.println("Informe o número de peças");
		numPeca2 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça 2: ");
		valorUni2 = sc.nextDouble();
		
		double valorPago = numPeca1 * valorUni1 + numPeca2 * valorUni2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPago);
	}

}
