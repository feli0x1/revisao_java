package aula95_boxing_unboxing_wrapper_classes;

public class ExemploAula {
	public static void main(String[] args) {
		int numero = 50;
		
		// Boxing
		// A variável obj é criada na stack, apontando 
		// para uma 'caixa' / 'variável'
		// na heap (área de alocação dinâmica), que possui
		// o valor da variável 'numero'
		Object obj = numero;
		Integer obj2 = numero;
		System.out.println("obj = " + obj);
		
		// Unboxing
		// A variável numero2 é criada dentro da stack, copiando
		// o valor de obj
		int numero2 = (int) obj;
		
		int numero3 = obj2;
		System.out.println("numero2 = " + numero2);
		System.out.println("numero * 2 = " + numero3 * 2);
	}
}