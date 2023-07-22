package aula58_funcoes_trabalhar_strings;

public class StringSplit {
	public static void main(String[] args) {
		String listaFrutas = "abacate banana morango amora pera";
		String[] frutas = listaFrutas.split(" "); // split() separando a string por espaço(" ")
		
		String fruta1 = frutas[0];
		String fruta2 = frutas[1];
		String fruta3 = frutas[2];
		String fruta4 = frutas[3];
		String fruta5 = frutas[4];
		
		System.out.println(listaFrutas);
		System.out.println(fruta1);
		System.out.println(fruta2);
		System.out.println(fruta3);
		System.out.println(fruta4);
		System.out.println(fruta5);
	}
}