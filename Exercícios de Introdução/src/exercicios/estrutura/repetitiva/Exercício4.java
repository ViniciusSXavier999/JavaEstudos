package exercicios.estrutura.repetitiva;

import java.util.Scanner;

/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por
 *  linha, inclusive o X, se for o caso.
 */

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Dígite um valor inteiro");
		x = sc.nextInt();
		
		for (int i = 0; i <=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		

	}

}
