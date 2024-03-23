package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		//Para  converter data global para local precisa informar o timezone
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		/*Nessa funcao eu consigo ver o nome de todos zones id de casa país para usar 
		
		
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		*/
		
		 LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		 
		 //Dessa maneira eu escolho o zoneId pelo nome
		 LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		 
		 LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		 LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		 
		 System.out.println("r1 = " + r1);
		 System.out.println("r2 = " + r2);
		 System.out.println("r3 = " + r3);
		 System.out.println("r4 = " + r4);
		 
		 //Pegando dia, mes  e ano de maneira individual
		 System.out.println("d01 dia = " + d01.getDayOfMonth());
		 System.out.println("d01 mês = " + d01.getMonthValue());
		 System.out.println("d01 ano = " + d01.getYear());
		 
		 //Pegando hora e minuto indivual 
		 System.out.println("d02 hora = " + d02.getHour());
		 System.out.println("d02 minutos = " + d02.getMinute());
		 
		 //Qualquer duvida que eu tiver  é procurar  pela funcao ZoneId. lá tem as respostas para isso.
	}

}
