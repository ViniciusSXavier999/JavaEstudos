package exercicios.estrutura.condicional;

import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro, 
 * e depois dizer se este n�mero � negativo ou n�o
 * *
 */

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int N;
		
		System.out.println("Digite um n�mero e verifique se ele � negativo ou positivo: ");
		N = leia.nextInt();
		
		if (N < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
	}
}
