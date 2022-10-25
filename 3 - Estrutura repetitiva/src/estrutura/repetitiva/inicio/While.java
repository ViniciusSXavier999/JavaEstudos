package estrutura.repetitiva.inicio;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Isso serve pra gente fazer a leitura do primeiro valor do programa
		int x = sc.nextInt();
		int soma = 0;
		
		/*
		 * While executa a condi��o, se for verdadeira entra no bloco de c�digo, executa, bate nas
		 * chaves e volta novamente pra condi��o at� ela ser falsa
		 * 
		 */
		while (x != 0) {
			// atribuindo os valores que digitamos na tela.
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma dos valores �: " + soma);
		
		sc.close();

	}

}
