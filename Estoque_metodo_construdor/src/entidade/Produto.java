package entidade;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double valorTotalDoEstoque() {
		return preco * quantidade;

	}

	public void addProduto(int qtd) {
		this.quantidade += qtd;
	}

	public void removerProduto(int qtd) {
		this.quantidade -= qtd;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $"
				+ String.format("%.2f", valorTotalDoEstoque());
	}
}
