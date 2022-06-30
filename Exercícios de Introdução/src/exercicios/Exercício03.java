package exercicios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		
		
		System.out.println("Digite quatro números inteiros: ");
		
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		D = leia.nextInt(); 
		
		dif = A * B - C * D;
		
		System.out.println("A Diferença é: " + dif);
		

	}

}
