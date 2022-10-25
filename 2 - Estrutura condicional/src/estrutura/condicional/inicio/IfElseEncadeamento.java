package estrutura.condicional.inicio;

import java.util.Scanner;

public class IfElseEncadeamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a hora");
		hora = leia.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}

		else if (hora < 18) {
			System.out.println("Boa tarde");

		} else {
			System.out.println("Boa noite");
		}

	}

}
