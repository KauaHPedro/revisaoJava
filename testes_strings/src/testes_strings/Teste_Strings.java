package testes_strings;

public class Teste_Strings {

	public static void main(String[] args) {
		
		String frutas = "Maçã laranja melancia uva";
		String[] teste = separaString(frutas);
		
		for (var fruta : teste) {
			System.out.println(fruta);
		}

	}


	public static String[] separaString (String texto) {
		
		String[] textoSeparado = texto.split(" ");
		
		return textoSeparado;
		
		
	}

}