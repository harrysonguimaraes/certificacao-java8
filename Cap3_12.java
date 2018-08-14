public class Cap3_12 {
	
	public static void main(String[] args) {
		
		StrinBuilder numbers = new StringBuilder("0123456789");

		numbers.delete(2, 8);

		numbers.append("-").insert(2, "+");

		System.out.println(numbers);
	}
}