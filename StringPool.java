public class StringPool {
	
	public static void main(String[] args) {
		
		String s1 = "nome";
		String s2 = "nome";

		String s3 = new String("nome");

		System.out.println("s1 == s2 : " + s1 == s2);
		System.out.println("s1 == s3 : " + s1 == s3);
	}
}