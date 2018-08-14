public class Float {

	public static void main(String[] args) {

		float f1 = 102; //dá erro de compilação
		System.out.println(f1);		

		float f2 = (int)102.2; //funciona salvando 102
		System.out.println(f2);		
		
		float f3 = 1f * 0.0; //erro de compilação de conversão de double para float
		System.out.println(f3);		

		float f4 = 1f * (short)0.0;//funciona imprimindo 0;
		System.out.println(f4);

		float f5 = 1f * (boolean)0; //dá erro de compilação pois não dá para converter int to boolean
		System.out.println(f5);
	}
}