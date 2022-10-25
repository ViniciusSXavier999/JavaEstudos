package estrutura.condicional.inicio;

import java.util.Scanner;

public class IfElseComposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a hora");
		hora = leia.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		
		else {
			System.out.println("Boa tarde");
		}
		
	}

}
