
public class Main {

	//� essa fun��o que permite que nossa classe seja um programa executavel 
	public static void main(String[] args) {
		
		int x = 99;
		String nome = "Pedro";
		int idade = 25;
		double renda = 5000.0;
		
		//Comando para saida de dados
		// System.out.print("Bom dia pessoal!!");
		
		//Comando para saida de dados com quebra de linha (println)
		System.out.println("Ol� mundo!");
		
		//Para imprimir a variavel com o valor inicial dela
		System.out.println(x);
		
		//O + � utilizado para fazer a concatena��o de elementos.
		System.out.println("voc� vai de uber ou " + x);
		
		//impress�o de varios valores interpolados dentro de uma string.
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
