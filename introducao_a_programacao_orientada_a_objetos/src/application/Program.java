package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		// (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		// triângulos e dizer qual dos dois triângulos possui a maior área.
		// A fórmula para calcular a área de um triângulo a partir das medidas de seus
		// lados a, b e c é a seguinte (fórmula de Heron):
		// area = √(p(p − a)(p − b)(p − c))
		// onde p = (a + b + c) / 2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB,xC,yA, yB,yC;
		System.out.println("Entre com as medidas do triânulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p*(p - xA)*(p - xB)*(p -xC));
		
		
		
		
		System.out.println("Entre com as medidas do triânulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		 p = (yA + yB + yC) / 2;
		 double areaY = Math.sqrt(p*(p - yA)*(p - yB)*(p -yC));
		 
		 System.out.printf("Area do Triângulo X: %.4f%n",areaX);
		 System.out.printf("Area do Triângulo Y: %.4f%n",areaY);
		 
		 if(areaX > areaY) {
			 System.out.println("Maior area: X");
		 }else {
			 System.out.println("Maior area: Y");
		 }
		 
		 sc.close();
	}

}
