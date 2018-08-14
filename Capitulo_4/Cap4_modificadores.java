public class Cap4_modificadores {
	
	public void teste() {
		System.out.println("Sou um método public.");
	}

	void teste2() {
		System.out.println("Sou um método default (sem a plavra default. Estou visível para todo mundo do meu pacote. )");
	}

	private void teste3() {
		System.out.println("Sou um método privado. Tipo patricinha. Pouca gente tem acesso. Só quem é da minha classe.");
	}

	protected void teste4() {
		System.out.println("Sou protected. Só me acessa quem é da minha classe e eu mesma. Minhas subclasses não podem me chamar. Estranho neh?!");
	}

	public static void main(String[] args) {
		
		Cap4_modificadores cap4 = new Cap4_modificadores();
		cap4.teste();
		cap4.teste2();
		cap4.teste3();
		cap4.teste4();
	}

}