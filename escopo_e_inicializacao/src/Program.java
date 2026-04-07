import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 34.00;
		double discount;
		
		discount = (price < 20.00)? price * 0.1 : price * 0.05;
		Locale.setDefault(Locale.US);
		System.out.printf("Desconto : %.3f",discount);
	}

}
