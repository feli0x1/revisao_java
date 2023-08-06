package aula57_operadores_bitwise;

public class Exemplo1 {
	public static void main(String[] args) {
		int numero1 = 50;
		int numero2 = 23;
		System.out.printf("%d & %d = %d%n", numero1, numero2, numero1 & numero2);
		System.out.printf("%d | %d = %d%n", numero1, numero2, numero1 | numero2);
		System.out.printf("%d ^ %d = %d%n", numero1, numero2, numero1 ^ numero2);
		
		// 50
		// 0 0 1 1 0 0 1 0
		// 23
		// 0 0 0 1 0 1 1 1 
	}
}