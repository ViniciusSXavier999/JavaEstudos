package exercicios;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o primeiro Número inteiro: ");
		a = leia.nextInt();
		System.out.println("Número digitado: " + a + "\n" );
		
		
		System.out.println("Digite o Segundo Número inteiro: ");
		
		b = leia.nextInt();
		System.out.println("Número digitado: " + b + "\n");
		
		soma = a + b;
		
		System.out.println("A soma dos dois valores é: " + soma);
		
		

	}

}
