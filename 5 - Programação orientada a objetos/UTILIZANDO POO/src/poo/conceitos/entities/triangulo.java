package poo.conceitos.entities;

public class triangulo {
	
	// ATRIBUTOS DA CLASSE 
	public double a;
	public double b;
	public double c;
	
	// Criando a função que calcula a area do triângulo 
	/*
	 * Só vamos utilizar parametros caso a função precise de algo a mais do que está na classe
	 * 
	 */
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}
	

}
