package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int cp1, np1, cp2, np2;
		double vp1, vp2, soma1, soma2, total;
		
		System.out.println("Digite o c�digo da pe�a 1: ");
		cp1 = leia.nextInt();
		
		System.out.println("Digite o c�digo da pe�a 2: ");
		cp2 = leia.nextInt();
		
		System.out.println("Digite a quantidade de pe�a 1 que voc� vai levar: ");
		np1 = leia.nextInt();
		
		System.out.println("Digite a quantidade de pe�a 2 que voc� vai levar: ");
		np2 = leia.nextInt();
		
		System.out.println("Digite o valor unit�rio de cada pe�a 1: ");
		vp1 = leia.nextDouble();
		
		System.out.println("Digite o valor unit�rio de cada pe�a 2: ");
		vp2 = leia.nextDouble();
		
		soma1 = vp1 * np1;
		soma2 = vp2 * np2; 
		
		total = soma1 + soma2;
		
		System.out.printf("O valor a ser pago � %.2f%n", total);
		

	}

}
