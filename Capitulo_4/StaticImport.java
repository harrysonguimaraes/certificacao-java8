import static java.lang.System.out;
import static java.util.Arrays.asList;
// import static java.util.Arrays;
// Não se pode importar static amente uma classe. Somente seus membros static.

import java.util.List;

public class StaticImport {
	
	public static void main(String[] args) {
		
		out.println(10);
		// Importa static o out.

		// Importa staticamente o asList da classe Arrays.
		List<String> lista = asList("one");

		// Agora dá erro. A classe Arrays não foi importada.
		// List<String> outraLista = Arrays.asList("dois");

		out.println(lista);
	}
}