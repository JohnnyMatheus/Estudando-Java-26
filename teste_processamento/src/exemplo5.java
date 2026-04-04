import java.util.Locale;
import java.util.Scanner;
public class exemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		IO.print("Informe seu nome: ");
		nome = sc.next();
		IO.print("Informe sua idade: ");
		idade = sc.nextInt();
		Locale.setDefault(Locale.US);
		IO.print("Informe sua altura: ");
		altura = sc.nextDouble();
		IO.print("Sexo: ");
		sexo =  sc.next().charAt(0);
		
		System.out.printf("Seu nome é %s, sua idade é: %d e sua altura é %.2f %s\n ", nome,idade,altura,sexo);
		sc.close();
	}

}
