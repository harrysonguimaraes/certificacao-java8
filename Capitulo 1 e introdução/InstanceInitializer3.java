public class InstanceInitializer3 {

	private String name = "Fluffly";
	{System.out.println(name);}

	public static void main(String[] args) {
		
		InstanceInitializer3 ii = new InstanceInitializer3();

	}
}