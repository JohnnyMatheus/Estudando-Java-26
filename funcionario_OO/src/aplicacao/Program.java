package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println(funcionario);
		System.out.println();
		
		System.out.print("Qual porcentagem para incrementar no salário?");
		int incremento = sc.nextInt();
		funcionario.incrementarSalario(incremento);
		
		System.out.println("Dados atualizados " + funcionario);
		
		
	}

}
