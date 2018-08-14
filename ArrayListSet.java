import java.util.*;

public class ArrayListSet {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();

		lista.add("harryson");
		lista.add("Julio");

		String removido = lista.set(2, "Julio Cesar");

		System.out.println("novo array: " + lista);

		System.out.println("Elemento trocado: " + removido);

	}
}