import java.util.*;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String[] array = {"Item 1", "Item 2", "Item 3"};

		List<String> lista = Arrays.asList(array);

		ArrayList<String> listaReal = new ArrayList<>(lista);

		System.out.println(lista);

		lista.set(1, "Item 4");
		
		System.out.println(lista);

		System.out.println(Arrays.toString(array));

		listaReal.add("outro item");

		System.out.println(listaReal);

	}
}