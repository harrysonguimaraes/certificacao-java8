import java.time.*;
import java.time.format.*;

public class DateFormater3 {
	
	public static void main(String[] args) {
		
		LocalDateTime data = LocalDateTime.of(2016, 1, 1, 4, 20);

		System.out.println(data);

		DateTimeFormatter formato = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter formatoLongo = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

		System.out.println(formato.format(data));

		System.out.println(data.format(formato));
		System.out.println(data.format(formatoLongo));
	}
}