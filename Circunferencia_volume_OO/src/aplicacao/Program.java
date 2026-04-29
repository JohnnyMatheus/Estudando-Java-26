package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import util.Calcular;
public class Program {

	//EXEMPLO COM MEMBROS ESTÁTICOS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com valor do raio: ");
		double raio = sc.nextDouble();

		double c = Calcular.circunferencia(raio);
		double v = Calcular.volume(raio);

		System.out.printf("Circunfência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", Calcular.PI);

		sc.close();

	}

	

}
