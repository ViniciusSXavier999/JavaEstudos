package exercicios.estrutura.repetitiva;

import java.util.Scanner;

/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por
 *  linha, inclusive o X, se for o caso.
 */

public class Exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("D�gite um valor inteiro");
		x = sc.nextInt();
		
		for (int i = 0; i <=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		

	}

}
