import java.util.*;

public class Cap3_24 {
	
	public static void main(String[] args) {
		
		String[] names = {"tom", "dick", "Lorry"};

		List<String> list = Arrays.asList(names);
		list.set(0,"sue");

		System.out.println(names[0]);
	}
}