package aula23_saida_dados;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		// Diferença entre println() e print()
		System.out.println("Lorem ipsum");
		System.out.print("dolor sit amet");
		System.out.print(", consectetur adipiscing elit.");
		System.out.print("Nélio");
		
		int numero = 280;
		System.out.println();
		System.out.println(numero);
		
		double numeroPontoFlutuante = 15.2348743;
		System.out.println(numeroPontoFlutuante);
		
		// Formatação da string, limitando a quantidade de casas decimais
		// OBS: O printf() vai usar vírgula ou ponto dependendo do computador em que o programa está sendo executado
		System.out.printf("Número com 3 casas decimais: %.3f%n", numeroPontoFlutuante);
		
		// Setar o ponto como separador de casa decimal
		Locale.setDefault(Locale.US);
		System.out.printf("Número com 2 casas decimais: %.2f%n", numeroPontoFlutuante);
		
		// Concatenação (junção de textos)
		System.out.println("Resultado = " + numeroPontoFlutuante + " metros");
		
		// Concatenação com formatação
		System.out.printf("Resultado = %.1f metros%n", numeroPontoFlutuante);
		
		String nome = "João";
		int idade = 25;
		double salario = 2350.0;
		
		// Concatenação com outros formatos
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês%n", nome, idade, salario);
	}
}
