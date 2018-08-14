import java.time.*;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2016, 10, 20);

		LocalDateTime outro = LocalDateTime.of(2010, 03, 14, 4, 18);

		LocalTime hora = LocalTime.of(03, 14);

		LocalDateTime diaHoras = LocalDateTime.of(data, hora);

		System.out.println(diaHoras);
		System.out.println(outro);
	}
}