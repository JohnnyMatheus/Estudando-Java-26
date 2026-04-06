import java.util.Scanner;
import java.util.Locale;

public class operadoraTelefonia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		// a 100 minutos de telefone.
		// Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um
		// programa para ler a quantidade
		// de minutos que uma pessoa consumiu, daí mostra o valor a ser pago.

		Scanner sc = new Scanner(System.in);
		double conta = 50.00;
		int qtdMinutos;

		System.out.print("Informe quantidade de minutos consumidos: ");
		qtdMinutos = sc.nextInt();
		
		Locale.setDefault(Locale.US);
		
		if (qtdMinutos > 100) {
			conta = conta + (qtdMinutos - 100) * 2;
			System.out.printf("Valor a pagar: %.2f\n", conta);
		}else {
			System.out.printf("Valor a pagar: %.2f\n", conta);
		}

		sc.close();

	}

}
