package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Cotacao;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cotacao cotacao = new Cotacao();
		System.out.print("Qual o valor do dólar? ");
		cotacao.dollar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados?");
		cotacao.real = sc.nextDouble();
		System.out.println(cotacao);
	}

}
