public class Cap3_8 {
	
	public static void main(String[] args) {
		
		String numbers = "012345678";

		System.out.println(numbers.substring(1,3)); //12
		System.out.println(numbers.substring(7,7));// ""
		System.out.println(numbers.substring(7)); // 78
	}
}