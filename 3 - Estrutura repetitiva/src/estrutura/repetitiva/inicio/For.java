package estrutura.repetitiva.inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			int valor = sc.nextInt();
			list.add(valor);
		}
		
		System.out.println(list.get(8));
		
	}
	
}
