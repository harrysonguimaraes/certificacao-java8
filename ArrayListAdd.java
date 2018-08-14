import java.util.*;

public class ArrayListAdd {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();

		lista.add("Harryson");
		lista.add("Julio");
		lista.add("Yasmin");
		lista.add("Mãe");

		System.out.println(lista);

		lista.add(2, "Pai");

		String removeu = lista.remove(0);
	
		System.out.println(lista);
		System.out.println("Elemento removido: " + removeu);


	}

}