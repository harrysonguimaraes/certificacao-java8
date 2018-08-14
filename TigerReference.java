public class TigerReference {
	
	public static void main(String[] args) {
		
		TigerReference t1 = new TigerReference();
		TigerReference t2 = new TigerReference();
		TigerReference t3 = t1;

		System.out.println(t1 == t1);
		System.out.println(t1 == t3);
		System.out.println(t1 == t2);

	}
}