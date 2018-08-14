import java.util.*;

public class ArrayListClear {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();

		lista.add("harryson");
		lista.add("Júlio");

		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista);

		lista.clear();

		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista);

	}
}