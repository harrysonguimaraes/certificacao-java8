public class Casting {
	
	public static void main(String[] args) {
		
		short x = 3;
		short y = 10;
		// Mesmo somando 2 shorts, o valor é promovido a int, então é necessário o casting.
		short z = (short)(x + y);

		System.out.println(z);
	}
}