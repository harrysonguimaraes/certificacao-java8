public class ErroStatic {
	
	private static final int n1;
	private static final int n2;
	private static final int n3 = 3;
	// private static final int n4; Erro de compilação, pois n4 não foi inicializada aqui, nem no bloco static

	static {

		n1 = 1;
		// n2 = 2;
		// n3 = 3; // Erro de compilação, pois n3 é final e já teve atribuição.
	}

	static {
		n2 = 2;
	}


	public static void main(String[] args) {
		
	}
}