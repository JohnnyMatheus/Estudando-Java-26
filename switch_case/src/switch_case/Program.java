package switch_case;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um dia da semana");
		int x = sc.nextInt();

		String dia;
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";

		default:
			dia = "Valor inválido";
			break;
		}
		System.out.println(dia);
	}
}
