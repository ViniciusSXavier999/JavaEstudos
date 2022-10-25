package exercicios.estrutura.repetitiva;

import java.util.Scanner;

/*
 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes.
 *  Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma:
 *   1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) 
 *   deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o 
 *   c�digo informado for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade 
 *   de clientes que abasteceram cada tipo de combust�vel.
 */

public class Exerc�cio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo; 
		
		System.out.println("Pesquisa de melhor combustiveis");
		System.out.println("----------------------------------");
		System.out.println("1 -> Alcool");
		System.out.println("2 -> Gasolina");
		System.out.println("3 -> Diesel");
		System.out.println("4 -> Para ver a pesquisa");
		System.out.println("----------------------------------");
		
		
		
		System.out.println("Digite o seu tipo de combustivel preferido");
		tipo = leia.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}else if (tipo == 2) { 
				gasolina = gasolina + 1;
			}else if (tipo == 3) {
				diesel = diesel + 1;
			}else if (tipo > 4) {
				System.out.println("Informe apenas n�meros entre 1 e 4");
			}
			
			
			tipo = leia.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		leia.close();
	}

}
