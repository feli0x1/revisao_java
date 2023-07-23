package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Digite os dados do produto:");
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		p.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.printf("Dados do produto: %s, %d unidade(s), total: R$ %.2f%n", p.nome, p.quantidade, p.valorTotalDoEstoque());
		
		System.out.println();
		System.out.print("Digite a quantia que vai ser adicionada no estoque do produto: ");
		p.adicionarProduto(sc.nextInt());
		System.out.println();
		System.out.printf("Dados atualizados: %s, %d unidade(s), total: R$ %.2f%n%n", p.nome, p.quantidade, p.valorTotalDoEstoque());
		
		System.out.print("Digite a quantia que vai ser removida no estoque do produto: ");
		p.removerProduto(sc.nextInt());
		System.out.println();
		System.out.printf("Dados atualizados: %s, %d unidade(s), total R$ %.2f", p.nome, p.quantidade, p.valorTotalDoEstoque());
		sc.close();
	}
}