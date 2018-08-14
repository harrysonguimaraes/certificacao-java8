public class Modulus {
	
	public static void main(String[] args) {
		
		System.out.println(9 / 3);//Vai imprimir 3;
		System.out.println(9 % 3);//Vai imprimir 0;
		
		System.out.println(10 / 3);//Vai imprimir 3, mas eu achava que era 3.33333333;
		System.out.println(10 % 3);//Vai imprimir 1;

		System.out.println((float)10 / 3);//Agora sim imprime 3.3333333

		System.out.println(-10 / 3); // imprime -3
		System.out.println(-10 % 3); // imprime -1

		System.out.println(10 / -3);// imprime -3
		System.out.println(10 % -3);//imprime 1

		System.out.println(10.11 / 3);//um float
		System.out.println(10.11 / 3.22);//outro float
		

		System.out.println(10.11 % 3.22);
		System.out.println(10.11 % 3);


	}
}