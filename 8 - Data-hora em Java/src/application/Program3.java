package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

// CONVERTER DATA LOCAL PARA GLOBAL

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (String s : ZoneId.getAvailableZoneIds())
		// System.out.println(s);

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		// CONVERTENDO O INSTANT PARA UMA DATA LOCAL CONSIDERANDO O FUSO HORARIO DO MEU COMPUTADOR
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		//  Obter dados de uma data-hora local
		
		// PEGANDO O DIA DO D04, PEGANDO DIA DE UMA DATA LOCAL
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		
		// PEGANDO O MES DO D04, PEGANDO DIA DE UMA DATA LOCAL
		System.out.println("d04 mês = " + d04.getMonthValue());
		
		// PEGANDO O ANO DO D04, PEGANDO DIA DE UMA DATA LOCAL
		System.out.println("d04 ano = " + d04.getYear());

		// PEGANDO A HORA DO D05
		System.out.println("d05 hora = " + d05.getHour());
		
		// PEGANDO OS MINUTOS DO D05
		System.out.println("d05 minutos = " + d05.getMinute());

	}

}
