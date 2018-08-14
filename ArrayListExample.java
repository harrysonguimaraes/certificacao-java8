import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {

		List<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);

		List<Integer> lista2 = new ArrayList<>(lista1);
		lista2.add(10);

		System.out.println(lista1);
		System.out.println(lista2);
		
	}
}