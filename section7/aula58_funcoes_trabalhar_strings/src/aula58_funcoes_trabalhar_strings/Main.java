package aula58_funcoes_trabalhar_strings;

public class Main {
	public static void main(String[] args) {
		String mensagem = "ashud HaW dkofg ABC sh sh sh   ";
		String mensagemLowercase = mensagem.toLowerCase();
		String mensagemUppercase = mensagem.toUpperCase();
		String mensagemSemEspacos = mensagem.trim();
		String olaMundo = "    Olá Mundo!    ";
		String olaMundoTrim = olaMundo.trim();
		String olaMundoSubString = olaMundo.substring(4);
		String olaMundoSubString2 = olaMundo.substring(4, 7);
		String mensagemSubstituida = mensagem.replace('a', 'j');
		String mensagemSubstituida2 = mensagem.replace("sh", "bc");
		int x = mensagem.indexOf("sh");
		int y = mensagem.lastIndexOf("sh");
		
		System.out.printf("Mensagem original: -%s-%n", mensagem);
		System.out.printf("Mensagem lowercase: -%s-%n", mensagemLowercase);
		System.out.printf("Mensagem uppercase: -%s-%n", mensagemUppercase);
		System.out.printf("Mensagem trim: -%s-%n", mensagemSemEspacos);
		System.out.printf("olaMundo: -%s-%n", olaMundo);
		System.out.printf("olaMundoTrim: -%s-%n", olaMundoTrim);
		System.out.printf("olaMundoSubString: -%s-%n", olaMundoSubString);
		System.out.printf("olaMundoSubString2: -%s-%n", olaMundoSubString2);
		System.out.printf("Mensagem replace: -%s-%n", mensagemSubstituida);
		System.out.printf("Mensagem replace: -%s-%n", mensagemSubstituida2);
		System.out.println("Índice da primeira ocorrência de 'sh': " + x);
		System.out.println("índice da última ocorrência de 'sh': " + y);
	}
}