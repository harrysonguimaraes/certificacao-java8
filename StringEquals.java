public class StringEquals {
	
	public static void main(String[] args) {
		
		String s1 = "Meu nome";

		String s2 = "meu nome";

		System.out.println("Strings: \"" + s1 + "\" e \"" + s2 + "\"");
		System.out.println("com equals: " + s1.equals(s2));
		System.out.println("com equals ignore case: " + s1.equalsIgnoreCase(s2));
	}
}