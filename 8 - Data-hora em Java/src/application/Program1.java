package application;

// INSTANCIAÇÃO

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// INSTANCIANDO O LOCALDATE COM A DATA DE AGORA, ()now -> Data de agora 
		LocalDate d01 = LocalDate.now();
		
		// INSTANCIANDO A DATA JUNTAMENTE COM O HORARIO
		LocalDateTime d02 = LocalDateTime.now();
		
		// DATA-HORA GLOBAL 
		Instant d03 = Instant.now();

		// PEGANDO UM TEXTO ISO 8601 E GERANDO UMA DATA A PARTIR DELE, parse() -> básicamente faz a conversão
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		// CONVERTENDO TEXTO PARA DATA-HORA JUNTAMENTE COM OS MINUTOS.
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

		
		// CONVERTENDO TEXTO NO FORMATO CUSTOMIZADO PARA DATA-HORA 
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		// INSTANCIANDO PASSANDO DIA, MES E ANO .
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}
