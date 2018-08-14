public class ShortCircuit {
	
	public static void main(String[] args) {
		
		int x = 6;

		boolean y = (x >= 6) || (++x <= 7);
		System.out.println(x);//printa 6, pois o lado direito não é avaliado.
	}
}