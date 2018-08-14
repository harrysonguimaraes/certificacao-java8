import java.time.*;

public class PeriodExample {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();

		LocalTime hora = LocalTime.now();

		LocalDateTime dataHora = LocalDateTime.of(data, hora);

		Period periodo = Period.ofMonths(3);

		System.out.println(dataHora);

		dataHora = dataHora.plus(periodo);

		System.out.println(dataHora);
	}
}