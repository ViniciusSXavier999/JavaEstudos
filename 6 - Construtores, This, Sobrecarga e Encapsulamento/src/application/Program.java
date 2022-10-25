package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* 
		 * Automaticamente vai dar um erro na instancia��o do objeto, pois o construtor est� obrigando
		 * eu passar os dados e n�o deixa - los nulo
		 */
		
		// Product product = new Product(); 
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// Variavel temporaria para receber os dados que eu digitar 
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product( name, price);  
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}
