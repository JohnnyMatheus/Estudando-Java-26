import java.util.Locale;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
		
		Scanner sc = new Scanner(System.in);
		int numFunc,horaTrabalhada;
		double valorHora, calculo;
		
		System.out.println("Numero do Funcionário: ");
		numFunc =  sc.nextInt();
		System.out.println("Informe o número de horas trabalhadas: ");
		horaTrabalhada = sc.nextInt();
		System.out.println("Informe o valor que recebe por hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		calculo =  horaTrabalhada * valorHora;
		Locale.setDefault(Locale.US);
		System.out.printf("Número do funcionário: %d\n",numFunc);
		System.out.printf("Salário: = R$ %.2f", calculo);
		
	}

}
