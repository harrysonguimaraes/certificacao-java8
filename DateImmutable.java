import java.time.*;

public class DateImmutable {
	
	public static void main(String[] args) {
			
		LocalDate data = LocalDate.now();

		data.plusDays(1);

		System.out.println(data);

		data = data.plusWeeks(3);

		System.out.println(data);
	}
}