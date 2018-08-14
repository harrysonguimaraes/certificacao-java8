import java.util.*;

public class Cap3_21 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(4);
		lista.add(5);
		lista.set(1,6);
		lista.remove(0);

		for (Integer valor: lista) {
			System.out.println(valor);
		}
	}
}