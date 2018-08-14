import java.time.*;
import java.time.format.*;

public class DateFormatCustom {
	
	public static void main(String[] args) {

		LocalDateTime data = LocalDateTime.now();
		
		DateTimeFormatter formatoCustom = DateTimeFormatter.ofPattern("dd/MM/YY  hh:mm");
		// dd ou d: 0 na frente dos dias para casos menores que 10
		//MM ou MMM ou MMMM 6 ou 06 ou jun ou junho
		//yy ou yyyy 16 ou 2016
		// hh horas ou h
		// mm (em minúsculo) para minutos.
		//  as barras / podem ser usadas ou não, assim como a vírgula. ou -. Espaços tb podem ser usados.

		System.out.println(data.format(formatoCustom));
	}
}