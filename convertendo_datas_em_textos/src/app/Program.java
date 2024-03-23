package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		//Para formatarmos as datas do jeito que estão será usado as maneiras que tem nesse link
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		/*Criando um objeto de formatação considerando o fuso horario do sistema local,
		 estou fazendo isso porque o instant e uma data hora global com formato gmt, então não conseguimos instanciar normalmente*/
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		//Usando funções já pré-instaladas
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		//Usando funções pré instaladas  que possuem um timezone, para assim conseguir utilizar o instant
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 sem formatar = " + d01);
		System.out.println();
		//Podemos chamar de  outras  maneiras  formatando,como pode ser visto abaixo.
		System.out.println("d01 formatado = " + d01.format(fmt1)); 
		System.out.println("d01 formatado = " + fmt1.format(d01));
		System.out.println("d01 formatado = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("---------");
		System.out.println("d02 = " + d02.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		
		System.out.println("----------");
		/*Como não conseguimos usar o d03.format teremos que fazer essa maneira, usar o fmt para usar o format,
		 já que o formato global não dá para utilizar o format.  */
		System.out.println("d03 = " + fmt3.format(d03));
		//ENTAO QUANDO FOR INSTANT sempre formatar expecificando o timezone(fuso horario) e utalizando a variavel, fomo foi feito no exemplo acima
		
		//Utilizando a funcao pre instalada iso_date_time que peguei no link acima.
		System.out.println("d02 = " + d02.format(fmt4));
		
		//Utilizando funcao pre instalada ISO_INSTANT que peguei no link acima
		System.out.println("d03 com funcao pre instalda ISO_INSTANT " + fmt5.format(d03));
	}

}
