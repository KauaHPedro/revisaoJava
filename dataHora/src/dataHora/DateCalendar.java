package dataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateCalendar {

	public static void main(String[] args) throws ParseException {
		
		// Objetos Date armazenam o número de milissegundos desde a meia noite 01/01/1970
		
		Date atual = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = sdf1.parse("10/07/2003");
		Date d2 = sdf2.parse("10/07/2003 16:00:00");
		Date d3 = Date.from(Instant.now());
		
		System.out.println(sdf1.format(d1));
		System.out.println(sdf2.format(d2));
		System.out.println(sdf2.format(atual));
		System.out.println(d3);
		System.out.println(sdf3.format(d3));
		
		System.out.println();
		
		System.out.println("-----------------------------------------------------");
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d1);
		cal.add(Calendar.DAY_OF_MONTH, 10);
		Date teste = cal.getTime();
		System.out.println(sdf1.format(teste));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int hours = cal2.get(Calendar.HOUR);
		
		System.out.println(hours);
		
		Calendar hoje = Calendar.getInstance();
		hoje.setTime(Date.from(Instant.now()));
		
		Calendar diaAniversario = Calendar.getInstance();
		diaAniversario.setTime(d1);
		
		long diferenca = hoje.getTimeInMillis() - diaAniversario.getTimeInMillis();
		
		long diffSeconds = diferenca / 1000;
        long diffMinutes = diffSeconds / 60;
        long diffHours = diffMinutes / 60;
        long diffDays = diffHours / 24;
        
        System.out.println(diffDays);
		

	}

}
