package topicos.basicos.funcoes.string;

public class FuncoesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		// Converte a String para letras minusculas 
		String s01 = original.toLowerCase();
		
		// Converte a String para letras maiusculas
		String s02 = original.toUpperCase();
		
		// Elimina os espações entre as Strings 
		String s03 = original.trim();
		
		// Corta o método em determinada palavra
		String s04 = original.substring(2);
		
		// Corta a string no inicio e no fim conforme o indice 
		String s05 = original.substring(2, 9);
		
		
		// Troca palavras de uma frase de com acordo com as novas credenciais que você escolher
		String s06 = original.replace('a', 'x');
		
		
		String s07 = original.replace("abc", "xy");
		
		// Faz a busca 
		int i = original.indexOf("bc");
		
		// Faz a busca 
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("Trim: " + s03 );
		System.out.println("---------------------------------------");
		System.out.println("Substring: " + s04);
		System.out.println("Substring: " + s05);
		System.out.println("Replace: " + s06);
		System.out.println("Replace: " + s06);
		System.out.println("Replace: " + s07);
		System.out.println("---------------------------------------");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		
		
	}

}
