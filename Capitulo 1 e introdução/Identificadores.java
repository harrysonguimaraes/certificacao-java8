public class Identificadores {
	
	public static void main(String[] args) {
		
		//Identificadores devem começar com $ ou _ ou qualquer caracter não numérico.
		String $valid;
		String __valid;
		// String 1invalid;
		// String new; // erro
		String New; //válido pois mesmo new sendo reserved word, java é case sensitive e new é diferente de New
		String achoVálido; // válido. Pode-se usar variáveis com acento em
		String Class; //válido. Somente class não é válido.
		// String class; // inválido
	}
}