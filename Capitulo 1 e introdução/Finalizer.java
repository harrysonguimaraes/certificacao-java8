public class Finalizer {
	
	protected void finalize() {

		System.out.println("Método invocado ao destruir o objeto");
	}

	public static void main(String[] args) throws Exception{
		
		Finalizer f = new Finalizer();
		System.out.println("Objeto criado");
		// f = null;
		System.gc();
		Thread.sleep(5000);
	}
}