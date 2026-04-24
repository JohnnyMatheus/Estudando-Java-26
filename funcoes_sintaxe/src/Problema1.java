import java.util.Scanner;
public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler 3 números inteiros e mostrar na tela o maior deles
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com 3 numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1>n3) {
			System.out.println("Maior: "+ n1);
		}else if(n2 >n3 ) {
			System.out.println("Maior: "+ n2);
		}else {
			System.out.println("Maior: "+ n3);
		}
		
		
		sc.close();
	}

}
