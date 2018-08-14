public class NoPacotePrincipal {
	
	public static void main(String[] args) {
		
		Principal p = new Principal();
		//Tentando invocar um método privado de outra classe. Assim não dá neh, amigo. Mesmo você estando no pacote, não dá!!
		// p.latePrivado();

		//Como o lateDefault da classe Principal tem modificador de acesso default, ela é visível dentro do mesmo pacote. 
		p.lateDefault();
	}
}