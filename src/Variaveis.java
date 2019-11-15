import java.math.BigDecimal;

public class Variaveis {

	/**
	 * São tipos primitivos int, double, float, boolean, char, long, byte, short
	 * String não é primitivo (referência)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int idade = 28;
		int idadeB = 25;

		System.out.println(idade == idadeB);

		if (idade == idadeB) {
			System.out.println("Verdadeiro " + idade + idadeB);
		} else {
			System.out.println("Falso " + idade + idadeB);
			System.out.println(String.format("http://www.google.com.br?idade=%s", idade));
		}

		double salario = 10.00;

		String nomeCompleto = new String("José Silva");

	}

}
