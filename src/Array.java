import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Valores iniciais de cada tipo em um array
		// byte, short, int, long, float, double = 0
		// char '\u0000' ' '
		// boolean false;
		// reference[Objeto] null

		int[] id = new int[3]; // 0,1,2
//		id[0] = 100;
		id[1] = 12;
		id[2] = 13;
		System.out.println(id[0]);

		String[] herois = new String[3];
		herois[0] = "Superman";
		herois[1] = "Batman";
		herois[2] = "Flash";

		for (int i = 0; i < herois.length; i++) {
			System.out.println("Herois: " + herois[i]);
		}

		for (String heroi : herois) {
			if (heroi == "Batman") {
				break;
			}
			System.out.println(heroi);
		}

		for (String heroi : herois) {
			if (heroi == "Batman") {
				continue;
			}
			System.out.println(heroi);
		}

		List<String> strs = new ArrayList<>();
		strs.add("TESTE");
		strs.add("TESTE1");
		strs.add("TESTE2");

		strs.parallelStream().forEach(str -> {
			System.out.println(str);
		});

		int contador = 0;

		while (contador <= 10) {
			System.out.println("Contador Igual a " + contador);
			contador++;

			if (contador == 2) {
				break;
			}
		}

		// Que passa pelo menos 1 vez
		do {
			System.out.println("Contador igual " + contador);

		} while (contador == 11);
	}

}
