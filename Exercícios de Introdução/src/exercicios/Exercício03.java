package exercicios;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		
		
		System.out.println("Digite quatro n�meros inteiros: ");
		
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		D = leia.nextInt(); 
		
		dif = A * B - C * D;
		
		System.out.println("A Diferen�a �: " + dif);
		

	}

}
