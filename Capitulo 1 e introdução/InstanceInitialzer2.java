public class InstanceInitialzer2 {

	{
		private String teste = "teste alterado pelo initializer";
	}

	public static void main(String[] args) {
		InstanceInitialzer2 i = new InstanceInitialzer2();
		System.out.println(i.teste);
	}
}