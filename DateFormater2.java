import java.time.*;
import java.time.format.*;

public class DateFormater2 {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();

		LocalTime tempo = LocalTime.now();

		LocalDateTime dataHora = LocalDateTime.of(data, tempo);

		System.out.println(dataHora);		
		System.out.println(dataHora.format(DateTimeFormatter.ISO_LOCAL_DATE));		
		System.out.println(dataHora.format(DateTimeFormatter.ISO_LOCAL_TIME));		
		System.out.println(dataHora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));		
	}
}