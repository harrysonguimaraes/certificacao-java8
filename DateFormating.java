import java.time.*;

public class DateFormating {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();

		System.out.println(data.getDayOfWeek());	
		System.out.println(data.getMonth());	
		System.out.println(data.getYear());	
		System.out.println(data.getDayOfYear());	
	}
}