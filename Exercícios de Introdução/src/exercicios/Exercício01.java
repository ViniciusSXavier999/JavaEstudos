package exercicios;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o primeiro N�mero inteiro: ");
		a = leia.nextInt();
		System.out.println("N�mero digitado: " + a + "\n" );
		
		
		System.out.println("Digite o Segundo N�mero inteiro: ");
		
		b = leia.nextInt();
		System.out.println("N�mero digitado: " + b + "\n");
		
		soma = a + b;
		
		System.out.println("A soma dos dois valores �: " + soma);
		
		

	}

}
