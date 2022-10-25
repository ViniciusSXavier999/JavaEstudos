package exercicios.estrutura.condicional;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner leia = new Scanner(System.in);
		int N;
		
		
		System.out.println("Digite um número para saber se é par ou impar: ");
		N = leia.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Par");
			
		} else {
			System.out.println("IMPAR");
		}

	}

}
