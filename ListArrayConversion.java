import java.util.*;

public class ListArrayConversion {
	
	public static void main(String[] args) {
		
		ArrayList<String> listaString = new ArrayList<>();

		listaString.add("Harryson");
		listaString.add("Yasmin");
		listaString.add("Júlio");
	
		String[] objectArray = listaString.toArray(new String[0]);

		System.out.println(objectArray.length);

		System.out.println(listaString);

		System.out.println(Arrays.toString(objectArray));
	}
}