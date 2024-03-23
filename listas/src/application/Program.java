package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Victor");
		list.add("Azambuja");
		list.add("Thiago");
		list.add("Silvia");
		list.add("Celso");
		list.add("Adriana");
		list.add("Ana");
		list.add("Antonio");
		
		//Adicionar String na  posição que eu quiser, nesse caso 2
		list.add(2, "Baby");
		
		//Remover a String que começa com a letra que eu escolher, nesse caso A
		list.removeIf(x -> x.charAt(0) == 'A');
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		//Achar a posição de victor
		System.out.println("Index of Victor: " + list.indexOf("Baby"));
		//Achar a posição de Bob que não está na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		/*
		list.stream(): Converte a lista list em um fluxo (stream) de elementos.
		.filter(x -> x.charAt(0) == 'A'): Filtra os elementos do fluxo, mantendo apenas aqueles em que o primeiro caractere (charAt(0)) é igual a 'A'.
		.collect(Collectors.toList()): Coleta os elementos filtrados em uma lista.
		
		Portanto, o código está filtrando os elementos da lista list para manter apenas aqueles cujo primeiro caractere é 'A',
		 e armazenando esses elementos filtrados em uma nova lista chamada result.
		*/
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		//Vê qual o primeiro elemento da lista com o valor A e imprime, se não tiver nenhum elemento ele imprime null
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
