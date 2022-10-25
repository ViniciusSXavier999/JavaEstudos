package topicos.basicos.funcoes.string;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com 3 n�meros inteiros: ");
		int n1 = leia.nextInt();
		int n2 = leia.nextInt();
		int n3 = leia.nextInt();
		
		int maior = max(n1, n2, n3);
		
		showResult(maior);
		

	}
	
	public static int max(int a, int b, int c) {
		
		int mn;
		
		if (a > b && a > c) {  
			mn = a;
		} else if(b > c) {
			mn = b;
		} else {
			mn = c;
		}
		return mn;
	}
	
	// Os parametros da fun��o n�o precisam ser iguais ao do programa principal 
	/*
	 * Quando meu programa for executado e eu chamar a minha fun��o os valores que eu passar l� no programa 
	 * principal vai casar com os parametros da minha fun��o.
	 */
	public static void showResult(int value) {
		System.out.println("O numero maior �: " + value);
	}
	
}


