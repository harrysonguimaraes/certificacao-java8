public class ConstructorAndFinal{
	
	private final Integer num;

	private ConstructorAndFinal() {

		this.num = 10;
	}

	public static void main(String[] args) {
		
		ConstructorAndFinal c = new ConstructorAndFinal();
		System.out.println(c.num);
	}
}