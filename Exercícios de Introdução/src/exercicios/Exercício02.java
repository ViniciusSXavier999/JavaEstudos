package exercicios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double r = leia.nextDouble();
		double a;
		double pi =  3.14159;
		
		a = pi * r * r ;
		
		System.out.printf("A=%.4f%n", a);
		
		

	}

}
