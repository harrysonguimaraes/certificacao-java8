public class InstanceInitializer {
	
	{
		System.out.println("teste");
	}

	{
		System.out.println("Mais um teste");
	}

	public static void main(String[] args) {

		System.out.println("outro teste");
		{
			System.out.println("terceiro teste");
		}
	}
}