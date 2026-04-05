import java.util.Scanner;
public class Ex1 {

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Informe o 1° número: ");
		num1 = sc.nextInt();
		System.out.println("Informe o 2° número: ");
		num2 = sc.nextInt();
		
		soma = num1 +num2;
		
		System.out.printf("SOMA = %d",soma);
		
	}

}
