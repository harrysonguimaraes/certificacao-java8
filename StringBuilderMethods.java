public class StringBuilderMethods {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("animals");

		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		//Aqui, substring não altera sb

		int len = sb.length();

		char ch = sb.charAt(6);

		System.out.println(sub + " " + len + " " + ch);
	}
}