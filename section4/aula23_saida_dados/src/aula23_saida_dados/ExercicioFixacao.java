package aula23_saida_dados;

import java.util.Locale;

public class ExercicioFixacao {
	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 50;
		int codigo = 5013;
		char genero = 'F';
		
		double preco1 = 3200.0;
		double preco2 = 150.0;
		double medida = 34.458713;
		
		System.out.println("Produtos:");
		System.out.printf("%s, que custa R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, que custa R$ %.2f%n%n", produto2, preco2);
		System.out.printf("Registro: %d anos, código %d e gênero %c%n%n", idade, codigo, genero);
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Com casa decimal do sistema estadunidense (EUA): %.3f%n", medida);	
	}
}
