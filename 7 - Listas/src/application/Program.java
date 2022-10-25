package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		// As listas só aceitam classes wrappers
		
		/*
		 * Na hora de instanciar a interface list, eu tenho que utilizar uma classe
		 * para implementar essa interface, no caso usamos a classe ArrayList
		 */
		List<String> list = new ArrayList<>();
		
		// método para adicionar elementos na lista (.add)
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// Aqui estamos adicionando elementos na lista em determinado indice da mesma.
		// Nesse caso estamos adicionando marco no indice 2.
		list.add(2, "Marco");
		
		// Vamos imprimir na tela o valor da lista 
		System.out.println(list.size());
		
		// Percorrendo a lista utilizando o for each
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		/*
		 * Aqui estamos definindo uma função lambda, ela também é conhecida como predicado, ela é
		 * uma função que vai me retornar em verdadeiro ou falso.
		 * 
		 * nesse método estamos dizendo 
		 * 
		 * 
		 * Pega um valor M e me retorna se esse x for igual a M (Vai remover todo mundo em que o primeiro
		 * caracter for M.)
		 */
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		// para encontrar a posição de um elemento utilizamos indexOf
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		// Fazendo filtros de elemento que começam com "A"
		
		/*
		 * stream -> é um tipo especial do java que aceita operações com expressão lambda
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
