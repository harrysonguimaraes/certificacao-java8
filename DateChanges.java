import java.time.*;

public class DateChanges {

	public static void main(String[] args) {
		
		LocalDateTime data = LocalDateTime.now();

		System.out.println(data);

		data = data.plusMinutes(59);

		System.out.println(data);

		data = data.plusYears(12);

		System.out.println(data);

		data = data.minusSeconds(13);

		System.out.println(data);
		
	}
	
}