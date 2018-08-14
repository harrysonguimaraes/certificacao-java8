import java.util.*;

public class ArrayListContains {
	
	public static void main(String[] args) {
			
			ArrayList<String> lista = new ArrayList<>();

			lista.add("Júlio");
			lista.add("Yasmin");
			lista.add("Harryson");

			System.out.println("Yasmin encontrada na lista: " + lista.contains("Yasmin"));
	}
}