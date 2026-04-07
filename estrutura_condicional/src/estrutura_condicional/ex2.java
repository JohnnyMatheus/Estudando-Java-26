package estrutura_condicional;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É PAR");
		}else {
			System.out.println("É IMPAR");
		}
	}

}
