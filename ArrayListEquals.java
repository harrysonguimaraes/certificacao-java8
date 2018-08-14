import java.util.*;

public class ArrayListEquals {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>(17);
		ArrayList<String> lista2 = new ArrayList<>();

		System.out.println(lista1.equals(lista2));

		lista1.add("Harryson");

		System.out.println(lista1.equals(lista2));

		lista2.add("Harryson");
	
		System.out.println(lista1.equals(lista2));

	}
}