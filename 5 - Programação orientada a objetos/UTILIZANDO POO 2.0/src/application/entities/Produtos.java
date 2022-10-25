package application.entities;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalvalueInStock() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		// Esse comando vai somar o quantidade que veio como argumento mais o atributo da classe
		this.quantidade += quantidade;
		
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	

	

}
