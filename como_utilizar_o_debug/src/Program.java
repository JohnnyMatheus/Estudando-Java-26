import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Metro Quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n",preco);
	}

}
