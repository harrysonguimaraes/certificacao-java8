public class PassByValor {
	
	public static void main(String[] args) {
		
		int a = 10;

		int b = 200;

		System.out.println(a);
		System.out.println(b);

		troca(a,b);


		System.out.println(a);
		System.out.println(b);
		// A passagem é sempre por valor.
	}

	private static void troca(int a, int b) {

		int temp = a;
		a = b;

		b = temp;
	}
}