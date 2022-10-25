package topicos.basicos.funcoes.string;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com 3 números inteiros: ");
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
	
	// Os parametros da função não precisam ser iguais ao do programa principal 
	/*
	 * Quando meu programa for executado e eu chamar a minha função os valores que eu passar lá no programa 
	 * principal vai casar com os parametros da minha função.
	 */
	public static void showResult(int value) {
		System.out.println("O numero maior é: " + value);
	}
	
}


