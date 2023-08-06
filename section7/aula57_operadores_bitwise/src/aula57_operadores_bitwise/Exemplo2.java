package aula57_operadores_bitwise;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputUsuario = sc.nextInt();
		int mascara = 0b100000;
		
		if ((inputUsuario & mascara) != 0) {
			System.out.println("6o bit é diferente de 0!");
		}
		else {
			System.out.println("6o bit é igual a 0!");
		}
		
		sc.close();
	}
}