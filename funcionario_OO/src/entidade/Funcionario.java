package entidade;

import java.text.Format;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void incrementarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem /100;
	}

	public String toString() {
		return nome + ", " + String.format("$ %.2f", salarioLiquido());
	}

}
