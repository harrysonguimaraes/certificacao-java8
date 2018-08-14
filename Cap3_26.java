import java.util.*;


public class Cap3_26 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ages = new ArrayList<>();

		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(3);
		ages.add(null);

		for(Integer age : ages) {

			System.out.println(age);
		}

	}
}