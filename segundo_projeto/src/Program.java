import java.util.Locale;
//nova sintaxe java

void main() {
	IO.println("Olá mundo2");

	
	
	int y = 32;
	double x = 10.35784;
	
	System.out.println(x);
	

	System.out.printf("%.2f\n",x);
	System.out.printf("%.4f\n",x);
	
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f\n",x);
	
	System.out.printf("Resultado = %.2f metros\n",x);
	
	
	String nome ="Maria";
	int idade = 31;
	double renda = 4000.0; 
	System.out.printf("%s tem %d idade  e ganha R$: %.2f reais \n",nome,idade,renda);
	
	
}