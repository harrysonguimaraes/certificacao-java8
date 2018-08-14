public class StringBuilderInsert {
	
	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("animals");

		s1.insert(7, "-");
		s1.insert(2, true);

		System.out.println(s1);
	}
}