package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		//Menos 7 dias da variavel d01
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		
		//Adicionando sete dias
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		//Acrestando anos 
		LocalDate nextYearLocalDate = d01.plusYears(7);
		
		System.out.println("-----");
		System.out.println("Somente Local Date, utilizando as funções plus e minus na variavel d01");
		System.out.println("d01 = " + d01);
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearLocalDate = " + nextYearLocalDate);
		System.out.println("-----");
		
		System.out.println("-----");
		System.out.println("Somente Local Date, utilizando as funções plus e minus na variavel d02");
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDateTime);
		System.out.println("------");
		
		//Usando agora Instant, a maneira do instant é diferente do LocalDate,
		//precisamos usar o ChronoUnit  para aumentar os dias ou diminuir
		
		System.out.println("Agora usando o Instant d03");
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		//Calcular a duração de uma data hora
		System.out.println("------------------");
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("t1 dias = " + t1.toDays());
		
		/*Dessa maneira não daria certo porque precisa dos segundos então o correto a se fazer seria colocar a funcao
		 .atime(0, 0) apos o nome da variavel ou .atStartOfDay()
		
		
		Duration t2 = Duration.between(pastWeekLocalDate, d01);
		System.out.println("t2 dias = " + t2.toDays());
		
		*/
		
		//Modelo correto abaixo
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
		System.out.println("t2 dias = " + t2.toDays());
		
		//Outra maneira sendo feita
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("t3 dias = " + t3.toDays());
		
		//Agora usando o instant
		Duration t4 = Duration.between(pastWeekInstant, d03);
		System.out.println("t4 dias = " + t4.toDays());
		
		//Estou sempre colocando do menor para o maior, agora irei colocar do maior para o menor
		Duration t5 = Duration.between(d03, pastWeekInstant);
		System.out.println("t5 dias = " + t5.toDays());
		
	}

}
