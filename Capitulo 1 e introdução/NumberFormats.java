public class NumberFormats {
	
	public static void main(String[] args) {
		
		System.out.println(56); // 56
		System.out.println(0b11); // 3 - Número com início 0b indica que é binario
		System.out.println(017); //15 - Número iniciando com 0 é em base octal
		System.out.println(0x1F); //31 - Número iniciando em 0x é base 16

		System.out.println(10_000); // Compila. Usado para facilitar leitura dos números.

		// System.out.println(_100.00); náo compila pois está no começo
		// System.out.println(100.00_);  náo compila pois está no final
		// System.out.println(100_.00); Náo compila pois está próximo do ponto decimal.
		System.out.println(10_0.0_0); // Mesmo ficando horrível, compila,  pois não está nem no começo/fim, nem próximo a ponto decimal.
	}
}