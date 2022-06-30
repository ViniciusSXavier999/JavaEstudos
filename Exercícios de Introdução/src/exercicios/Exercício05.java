package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int cp1, np1, cp2, np2;
		double vp1, vp2, soma1, soma2, total;
		
		System.out.println("Digite o código da peça 1: ");
		cp1 = leia.nextInt();
		
		System.out.println("Digite o código da peça 2: ");
		cp2 = leia.nextInt();
		
		System.out.println("Digite a quantidade de peça 1 que você vai levar: ");
		np1 = leia.nextInt();
		
		System.out.println("Digite a quantidade de peça 2 que você vai levar: ");
		np2 = leia.nextInt();
		
		System.out.println("Digite o valor unitário de cada peça 1: ");
		vp1 = leia.nextDouble();
		
		System.out.println("Digite o valor unitário de cada peça 2: ");
		vp2 = leia.nextDouble();
		
		soma1 = vp1 * np1;
		soma2 = vp2 * np2; 
		
		total = soma1 + soma2;
		
		System.out.printf("O valor a ser pago é %.2f%n", total);
		

	}

}
