package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NewLocalDate {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println(dataHoraAtual);
		
		Instant dataGlobal = Instant.now();
		System.out.println(dataGlobal);
		
		LocalDate convertendoData = LocalDate.parse("2025-06-18");
		LocalDateTime convertendoDataHora = LocalDateTime.parse("2025-06-18T15:06:25");
		Instant convertendoDataHoraGlobal = Instant.parse("2025-06-18T15:06:25-03:00");
		
		System.out.println(convertendoDataHoraGlobal);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate formatAlt = LocalDate.parse("10/07/2003", fmt1);
		LocalDateTime formatAlt2 = LocalDateTime.parse("10/07/2003 15:00", fmt2);
		
		System.out.println(formatAlt);
		System.out.println(formatAlt2);
		
		LocalDate separados = LocalDate.of(2007, 7, 5);
		System.out.println(separados);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(LocalDate.now().format(fmt1));
		System.out.println(LocalDateTime.now().format(fmt2));
		System.out.println(fmt2.format(LocalDateTime.now()));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").
				withZone(ZoneId.systemDefault());
		
		System.out.println(fmt3.format(Instant.now()));
		
		System.out.println("-------------------------------------------------");
		
		Instant d01 = Instant.parse("2025-02-09T01:00:00Z");
		LocalDateTime r1 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		System.out.println(r1.format(fmt2));
		
		System.out.println("Dia do meu aniversário: " + LocalDate.parse("2003-07-10").getDayOfMonth());
		System.out.println("2025 já teve: " + LocalDate.now().getDayOfYear() + " dias");
		
		System.out.println("-------------------------------------------------");
		
		LocalDate aniversario = LocalDate.parse("10/07/2003", fmt1);
		System.out.println(aniversario.plusDays(8).format(fmt1));
		
		System.out.println("Hoje é dia: " + fmt3.format(Instant.now()));
		System.out.println("Daqui duas horas será: " + fmt3.format(Instant.now()
				.plus(2, ChronoUnit.HOURS)));
		
		System.out.println();
		
		Duration duracao = Duration.between(aniversario.atStartOfDay(), LocalDate.now().atStartOfDay());
		
		System.out.printf("Eu estou vivo há %d dias, ou %d horas, ou então %d minutos%n",
				duracao.toDays(),
				duracao.toHours(),
				duracao.toMinutes());
		

	}

}
