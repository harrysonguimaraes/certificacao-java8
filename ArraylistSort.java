import java.util.*;

public class ArraylistSort {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();

		lista.add("Harryson");
		lista.add("Yasmin");
		lista.add("Eliana");
		lista.add("Júlio");

		System.out.println(lista);

		Collections.sort(lista);
		System.out.println(lista);
	}
}