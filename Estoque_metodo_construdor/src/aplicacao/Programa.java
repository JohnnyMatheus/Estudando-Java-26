package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome,preco,quantidade);
		
		System.out.println("Entre com o numero de produtos a adicionados estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println("Dados do produto: " + produto);
		System.out.println("Entre com o numero de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.print("Dados atualizados: " + produto);
	}

}
