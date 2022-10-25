package entities;

public class Product {
	
	// Fazendo o uso do encapsulamento 
	private String name;
	private double price;
	private int quantity;

	// É possivel criar um construtor para evitar por exemplo a existência de
	// produtos sem nome e preço
	/*
	 * Criando construtor que obriga oo usuario a entrar com os dados, para que isso
	 * seja possivel o construtor deve receber os dados como parametros
	 * 
	 */
	// poderia ser outros nomes como parametro, boas praticas ele recebe os mesmos
	// que os atributos
	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	// Fazendo o uso de sobrecarga

	public Product(String name, double price) {

		this.name = name;
		this.price = price;

	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}