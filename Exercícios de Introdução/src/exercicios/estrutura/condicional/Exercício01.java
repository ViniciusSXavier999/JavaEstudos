package exercicios.estrutura.condicional;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro, 
 * e depois dizer se este número é negativo ou não
 * *
 */

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int N;
		
		System.out.println("Digite um número e verifique se ele é negativo ou positivo: ");
		N = leia.nextInt();
		
		if (N < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
	}
}
