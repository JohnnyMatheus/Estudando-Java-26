package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entiddade.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println(produto);
		
		sc.close();

	}

}
