package aula24_processamento_casting;

public class Exemplo4 {
	public static void main(String[] args) {
		int a, b;
		double resultado1, resultado2;
		
		a = 5;
		b = 2;
		resultado1 = a / b;
		
		// Casting explícito
		resultado2 = (double) a / b;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}