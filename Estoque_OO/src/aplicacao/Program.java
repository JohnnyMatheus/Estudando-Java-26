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
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.print("Entre com número de produtos para ser adicionado no estoque: ");
		int qtd = sc.nextInt();
		produto.addProdutos(qtd);
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto);

		System.out.println();
		System.out.print("Entre com número de produtos para ser removido no estoque");
		qtd = sc.nextInt();
		produto.removerProduto(qtd);
		System.out.println("Dados atualizados do produto: " + produto);

		sc.close();

	}

}
