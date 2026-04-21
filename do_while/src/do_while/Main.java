package do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double F, C;
		char op;
		do {

			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = (9 * C / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);

			System.out.print("Deseja repetir s/n?: ");
			op = sc.next().charAt(0);

		} while (op != 'n');
		
	}

}
