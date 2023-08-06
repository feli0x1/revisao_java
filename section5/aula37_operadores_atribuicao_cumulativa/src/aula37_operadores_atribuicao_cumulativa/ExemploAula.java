package aula37_operadores_atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAula {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMinutos = sc.nextInt();
		
		double conta = 50.0;
		if (qtdMinutos > 100) {
			conta += (qtdMinutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}
}