package exercicios.estrutura.repetitiva;

import java.util.Scanner;

/*
 * Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. 
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o 
 * algoritmo encerrado. Considere que a senha correta � o valor 2002.
 * 
 */

public class Exerc�cio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int sc = 2002;
		int senha = leia.nextInt();

		while (senha != sc) {
			System.out.println("senha invalida");
			senha = leia.nextInt();
		}

		System.out.println("Acesso permitido!!");

	}

}
