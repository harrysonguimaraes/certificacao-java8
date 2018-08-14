import java.time.*;
import java.time.format.*;

public class ParseDate {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM dd yyyy");

		LocalDate data = LocalDate.parse("01 02 2016", formato);

		System.out.println(data);

	}
}