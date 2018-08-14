import java.util.*;

public class ArrayListDouble {
	
	public static void main(String[] args) {
		
		ArrayList<Double> lista = new ArrayList<>();

		float num = 30f;
		lista.add(num);


		lista.add(3.0);
		lista.add(30.4);
		lista.add(50.5);
		lista.add(new Double(37.87));

		System.out.println(lista);
	}
}