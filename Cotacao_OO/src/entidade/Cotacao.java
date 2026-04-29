package entidade;

public class Cotacao {
	public double dollar;
	public double real;
	public double imposto = 6;
	
	public double conversor() {
		double valor = (dollar * real);
		double resultado = valor +(valor *imposto)/100;
		return resultado;
	}
	
	public String toString() {
		return  String.format("Valor a ser pago em reais $%.2f", conversor());
	}
}
