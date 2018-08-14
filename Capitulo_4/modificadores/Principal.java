public class Principal {
	
	private void latePrivado() {
		System.out.println("Auau privado");
	}

	void lateDefault() {

		System.out.println("Auau default");
	}

	public static void main(String[] args) {
		
		Principal p = new Principal();

		//Método privado sendo invocado dentro da própria classe. Funciona.
		p.latePrivado();
		p.lateDefault();
	}
}