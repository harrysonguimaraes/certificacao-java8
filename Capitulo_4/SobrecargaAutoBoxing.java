public class SobrecargaAutoBoxing {
	
	private void printa(int num) {

		System.out.println(num + " invocado o tipo primitivo");
	}

	private void printa(Integer num) {

		System.out.println(num + " invocado o objeto Integer");
	}

	public static void main(String[] args) {
		
		SobrecargaAutoBoxing s = new SobrecargaAutoBoxing();

		Integer novo = 5;

		s.printa(3);
		s.printa(novo);
		s.printa(new Integer(4));
	}
}