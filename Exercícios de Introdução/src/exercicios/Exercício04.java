package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int N, H;
		double vh, salario;

		System.out.println("Digite o seu n�mero de funcionario: ");
		N = leia.nextInt();

		System.out.println("Digite a quantidade de horas que voc� trabalha por m�s: ");
		H = leia.nextInt();

		System.out.println("Quanto voc� recebe por hora? ");
		vh = leia.nextDouble();

		salario = vh * H;

		System.out.printf("O seu sal�rio �: %.2f%n ", salario);

		System.out.printf("Seu n�mero de funcionario � %d voc� trabalha %d horas e o seu s�lario � %.2f", N, H,
				salario);
		
		leia.close();

	}

}
