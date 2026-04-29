package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entindade.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Entre com a largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Entre com a altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
	}
}
