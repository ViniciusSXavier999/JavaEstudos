package entrada;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		// Dessa forma estou associando o meu objeto Scanner ao teclado no modo console
//Declarei a variavel   //Iniciei a variavel 
		Scanner leia = new Scanner(System.in);

		String x;
		int idade;

		System.out.println("Digite o seu nome\n");

		// Comando para ler o valor digitado pelo usuario (String) se fosse int seria
		// nextInt();.
		x = leia.next();
		System.out.println("Seu nome é: " + x + "\n");

		System.out.println("Digite a sua idade\n");

		// Comando para ler o valor digitado pelo usuario (Número inteiro).
		idade = leia.nextInt();
		System.out.println("Sua idade é: " + idade + "\n");
		
		//Encerra o meu Scanner 
		leia.close();

		/*
		 * 
		 * next(); String
		 * 
		 * nextInt(); Inteiro
		 * 
		 * nextDouble();  número com ponto flutuante
		 * 
		 * nextLine();  Para ler um texto ATÉ A QUEBRA DE LINHA (Você pode digitar
		 * diversos valores, até o momento que pular uma linha.
		 * 
		 * 
		 */

	}

}
