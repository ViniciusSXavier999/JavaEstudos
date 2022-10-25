package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Produtos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos p = new Produtos();
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		p.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + p);
		
		System.out.println();
		System.out.println("Entre com o número de produtos que deseja adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		// FAZ A ATUALIZAÇÃO DE PRODUTOS NO ESTOQUE 
		p.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + p);
		
		System.out.println();
		System.out.println("Entre com o número de produtos que deseja retirar do estoque: ");
		int remove = sc.nextInt();
		p.removeProdutos(remove);
		

		System.out.println();
		System.out.println("Dados atualizados: " + p);
		
		
		
		
				
		sc.close();

	}

}
