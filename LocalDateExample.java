import java.time.*;

public class LocalDateExample {
	
	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);

		LocalDate ontem = LocalDate.of(2016, 5, 10);
		LocalDate outroDia = LocalDate.of(2016, Month.JANUARY, 11);

		System.out.println(ontem);
		System.out.println(outroDia);
		
	}
}