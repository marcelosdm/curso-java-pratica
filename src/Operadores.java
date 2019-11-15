public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores de atribuição =, -=, +=, *=, /=, %=
		
		int idade = 18;
		idade = idade + 1;
		idade += 1;
		idade -= 1;
		idade *= 1;
		idade /= 1;
		idade %= 2;
	
		
		
		System.out.println(idade);
		
		//Operadores de comparação >=, <=, <, >, ==, !=
		
		boolean doisIgualUm = 2 <= 1;
		System.out.println("Dois igual a um " +  doisIgualUm);
		
		//Operadores lógicos && , ||
		int pessoas = 18;
		int lugares = 20;
		
		System.out.println(pessoas <= 20 || lugares > 20); //true
		System.out.println((pessoas <= 20 && lugares > 20) && 2 == 2); //false
		
		
	}

}
