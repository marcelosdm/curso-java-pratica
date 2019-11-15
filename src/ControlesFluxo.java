
public class ControlesFluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario = 1000;

		if (salario == 100) {
			System.out.println("Igual a " + 1000);
		} else {
			System.out.println("Diferente de " + 1000);
		}

		if (salario == 1000) {
			System.out.println("Igual a " + 1000);
		} else if (salario < 1000) {
			System.out.println("Menor que " + 1000);
		} else {
			System.out.println("Diferente de " + 1000);
		}

		// Operador ternário
		// validacao ? true : false
		System.out.println(
				salario == 100 ? "Salario é igual a 1000" : salario < 1000 ? "Salario menor que mil" : "diferente");

		// Switch : Tipos válidos char, int, byte, short , enum e String.

		int dia = 10;

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}

	}

}
