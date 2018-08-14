import java.time.*;

public class LocalTimeExample {
	
	public static void main(String[] args) {
		
		LocalTime horas1 = LocalTime.of(6, 15);
		LocalTime horas2 = LocalTime.of(24, 59, 31);
		LocalTime horas3 = LocalTime.of(6, 15, 30, 200);

		System.out.println(horas1);
		System.out.println(horas2);
		System.out.println(horas3);
	}
}