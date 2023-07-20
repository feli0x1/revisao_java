package aula39_operador_ternario;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAula {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço: R$ ");
		double preco = sc.nextDouble();
		double desconto;
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O preço ficou em R$ %.2f (R$ %.2f de desconto)%n", preco - desconto, desconto);
		
		
		sc.close();
	}
}