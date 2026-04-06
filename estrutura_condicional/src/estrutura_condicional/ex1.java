package estrutura_condicional;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		
		if(num == 0 ) {
			System.out.println("NEUTRO");
		}else if (num >0) {
			System.out.println("POSITIVO");

		}else {
			System.out.println("NEGATIVO");
		}
		
		
	}

}
