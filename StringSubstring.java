public class StringSubstring {
	
	public static void main(String[] args) {
		
		String s1 = "Animals";

		System.out.println(s1.substring(3));

		System.out.println(s1.substring(s1.indexOf('m')));

		System.out.println(s1.substring(3,6));
		System.out.println(s1.substring(3,4));
		// System.out.println(s1.substring(3,8));
		// System.out.println(s1.substring(3,2));
		System.out.println(s1.substring(3,3));
	}
}