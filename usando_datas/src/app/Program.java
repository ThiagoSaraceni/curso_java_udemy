package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		//Documentos para visualizar como formatar datas:
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

		//Instanciando a classe para ver a data de hoje, acima ele importou o java.time.LocalDate;
		//A data fica em formato ano-mes-dia
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		//Usando agora o DateTime com horas, minutos e segundos e fração de segundos.
		//Acima importou o import java.time.LocalDateTime;
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		//Agora criando com o horario GMT, horario padrao de londres.
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		//Instanciando agora  com o tipo de data já  do ISO8601
		LocalDate d04 = LocalDate.parse("2024-01-20");
		System.out.println("d04 = " + d04);
		
		//Instanciando já com o formato de data porem agora usando minutos e segundos
		LocalDateTime d05 = LocalDateTime.parse("2024-01-20T01:30:26");
		System.out.println("d05 = " + d05);
		
		//Agora fazendo a mesma coisa porém com o padrão GMT/UTC(horario de londres)
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("d06 = " + d06);
		
		//Utilizando o horario do Brasil, visto que a hora é  3horas adiantado comparado a londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println("d07 = " + d07);
		
		//Utilizando a formatação de datas, a variavel fmt que criei no inicio do codigo
		//Para montar essa variavel fmt eu olhei no link para ver como funciona o dia mes e ano, e quais letras usar sobre.
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		
		//Para montar essa variavel fmt eu olhei no link para ver como funciona o dia, mes, ano, horas, minutos e quais letras usar sobre.
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:40", fmt2);
		System.out.println(d09);
		
		//Usando chamando direto o argumento do DateTimeFormatter sem criar uma variavel para isso.
		LocalDateTime d10 = LocalDateTime.parse("15/05/2005 01:50", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(d10);
		
		/*Outra maneira de instanciar dia, mes e ano é usando o LocalDate.of, no LocalDate.of ele irá te mostrar se voce quer 
		ano, mes, dia por exemplo */
		
		LocalDate d11 = LocalDate.of(2024, 01, 30);
		System.out.println(d11);
		
		//Agora usando da mesma maneira porém com horas e minutos
		LocalDateTime d12 = LocalDateTime.of(2023, 7, 30, 14, 24);
		System.out.println(d12);
	}

}
