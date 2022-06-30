package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercício04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int N, H;
		double vh, salario;

		System.out.println("Digite o seu número de funcionario: ");
		N = leia.nextInt();

		System.out.println("Digite a quantidade de horas que você trabalha por mês: ");
		H = leia.nextInt();

		System.out.println("Quanto você recebe por hora? ");
		vh = leia.nextDouble();

		salario = vh * H;

		System.out.printf("O seu salário é: %.2f%n ", salario);

		System.out.printf("Seu número de funcionario é %d você trabalha %d horas e o seu sálario é %.2f", N, H,
				salario);
		
		leia.close();

	}

}
