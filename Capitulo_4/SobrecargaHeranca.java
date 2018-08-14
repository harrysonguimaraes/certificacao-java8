public class SobrecargaHeranca {
	
	public void printa(String s) {

		System.out.println(s + " método da String");
	}

	public void printa(Object s) {

		System.out.println(s + " método do Object");
	}

	public static void main(String[] args) {

		SobrecargaHeranca s = new SobrecargaHeranca();
		s.printa("uma frase");
		s.printa(42);
		s.printa('c');
		
	}
}