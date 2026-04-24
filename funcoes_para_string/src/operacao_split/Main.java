package operacao_split;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(vect[1]);
		
		
		String nomeCompleto ="Johnny Matheus";
		String[] vetor= nomeCompleto.split(" ");
		String n1 =  vetor[0];
		String n2 =  vetor[1];
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(nomeCompleto.trim());
	}

}
