import java.util.Locale;
import java.util.Scanner;
public class Ex2 {

	//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
	//casas decimais conforme exemplos.
	//Fórmula da área: area = π . raio^2
	//Considere o valor de π = 3.14159
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double raio,area;
		System.out.println("Informe o raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f",area);
		
		
	}

}
