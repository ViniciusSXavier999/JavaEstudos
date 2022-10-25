package estrutura.repetitiva.inicio;

import java.util.Scanner;

public class TesteDeMesaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x < 3) {
			x += 1;
			y += 2;
			System.out.println(x + "-" + y);
		}
		
		
		

	}

}
