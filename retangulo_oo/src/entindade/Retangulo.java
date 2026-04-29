package entindade;

public class Retangulo {
	public double largura;
	public double altura;

	public double Area() {
		return largura * altura;
	}

	public double Perimetro() {
		return (largura * 2) + (altura * 2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura,2));
	}
	public String toString() {
		return String.format("AREA = %.2f%n", Area())
				+ String.format("Perimetro = %.2f%n", Perimetro())
				+ String.format("DIAGONAL = %.2f%n", Diagonal());
	}

}
