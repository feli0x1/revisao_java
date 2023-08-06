package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalDoEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + 
			   ", " +
			   String.format("R$ %.2f", preco) +
			   ", " +
			   quantidade +
			   " unidade(s), " +
			   "Total: R$ " +
			   String.format("%.2f", valorTotalDoEstoque());
	}
}